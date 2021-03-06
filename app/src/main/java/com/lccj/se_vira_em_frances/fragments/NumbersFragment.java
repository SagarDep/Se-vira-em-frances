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
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class NumbersFragment extends Fragment {

    public NumbersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.number_one, R.string.French_number_one,
                R.drawable.number_one));
        words.add(new Word(R.string.number_two, R.string.French_number_two,
                R.drawable.number_two));
        words.add(new Word(R.string.number_three, R.string.French_number_three,
                R.drawable.number_three));
        words.add(new Word(R.string.number_four, R.string.French_number_four,
                R.drawable.number_four));
        words.add(new Word(R.string.number_five, R.string.French_number_five,
                R.drawable.number_five));
        words.add(new Word(R.string.number_six, R.string.French_number_six,
                R.drawable.number_six));
        words.add(new Word(R.string.number_seven, R.string.French_number_seven,
                R.drawable.number_seven));
        words.add(new Word(R.string.number_eight, R.string.French_number_eight,
                R.drawable.number_eight));
        words.add(new Word(R.string.number_nine, R.string.French_number_nine,
                R.drawable.number_nine));
        words.add(new Word(R.string.number_ten, R.string.French_number_ten,
                R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_numbers);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
