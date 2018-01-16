package com.wmi.simplefunfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<NativeWord> words = new ArrayList<>();

        words.add(new NativeWord("Green Colors", "Haara"));
        words.add(new NativeWord("Red Colors", "Laal"));

        NativeLangAdapter NativeLangAdapter = new NativeLangAdapter(this, words);

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(NativeLangAdapter);

    }
}
