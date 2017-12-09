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
 * {@link Fragment} that displays a list of color vocabulary words.
 */
public class ColorsFragment extends Fragment {


    public ColorsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.color_red, R.string.french_red,
                R.drawable.color_red));
        words.add(new Word(R.string.color_yellow, R.string.french_yellow,
                R.drawable.color_mustard_yellow));
        words.add(new Word(R.string.color_green, R.string.french_green,
                R.drawable.color_green));
        words.add(new Word(R.string.color_brown, R.string.french_brown,
                R.drawable.color_brown));
        words.add(new Word(R.string.color_gray, R.string.french_gray,
                R.drawable.color_gray));
        words.add(new Word(R.string.color_black, R.string.french_black,
                R.drawable.color_black));
        words.add(new Word(R.string.color_white, R.string.french_white,
                R.drawable.color_white));


        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_colors);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
