package com.lccj.se_vira_em_frances;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of phrases.
 */
public class PhrasesFragment extends Fragment {

  public PhrasesFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.word_list, container, false);

    // Create a list of words
    final ArrayList<Word> words = new ArrayList<>();
    words.add(new Word(R.string.phrase_where_are_you_going,
        R.string.French_phrase_where_are_you_going));
    words.add(new Word(R.string.phrase_what_is_your_name,
        R.string.French_phrase_what_is_your_name));
    words.add(new Word(R.string.phrase_my_name_is,
        R.string.French_phrase_my_name_is));
    words.add(new Word(R.string.phrase_how_are_you,
        R.string.French_phrase_how_are_you));
    words.add(new Word(R.string.phrase_im_feeling_good,
        R.string.French_phrase_im_feeling_good));
    words.add(new Word(R.string.phrase_are_you_coming,
        R.string.French_phrase_are_you_coming));
    words.add(new Word(R.string.phrase_yes_im_coming,
        R.string.French_phrase_yes_im_coming));
    words.add(new Word(R.string.phrase_lets_go,
        R.string.French_phrase_lets_go));
    words.add(new Word(R.string.phrase_come_here,
        R.string.French_phrase_come_here));

    WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_phrases);

    ListView listView = rootView.findViewById(R.id.list);
    listView.setAdapter(adapter);

    return rootView;
  }
}

