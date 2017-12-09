package com.lccj.se_vira_em_frances.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.lccj.se_vira_em_frances.R;
import com.lccj.se_vira_em_frances.fragments.PhrasesFragment;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new PhrasesFragment())
                .commit();
    }
}