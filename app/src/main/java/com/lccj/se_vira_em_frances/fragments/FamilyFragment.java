package com.lccj.se_vira_em_frances.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.lccj.se_vira_em_frances.R;
import com.lccj.se_vira_em_frances.utils.Word;
import com.lccj.se_vira_em_frances.adapters.WordAdapter;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class FamilyFragment extends Fragment {

  public FamilyFragment() {
    // Required empty public constructor
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.word_list, container, false);

    // Create a list of words
    final ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word(R.string.family_father, R.string.french_father,
        R.drawable.family_father));
    words.add(new Word(R.string.family_mother, R.string.french_mother,
        R.drawable.family_mother));
    words.add(new Word(R.string.family_son, R.string.French_family_son,
        R.drawable.family_son));
    words.add(new Word(R.string.family_daughter, R.string.French_family_daughter,
        R.drawable.family_daughter));
    words.add(new Word(R.string.family_brother, R.string.French_family_brother,
        R.drawable.family_older_brother));
    words.add(new Word(R.string.family_grandmother, R.string.French_family_grandmother,
        R.drawable.family_grandmother));
    words.add(new Word(R.string.family_grandfather, R.string.French_family_grandfather,
        R.drawable.family_grandfather));

    WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);
    ListView listView = rootView.findViewById(R.id.list);
    listView.setAdapter(adapter);

    return rootView;
  }
}
