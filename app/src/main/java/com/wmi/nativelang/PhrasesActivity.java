package com.wmi.nativelang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.wmi.simplefunfacts.R;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<NativeWord> words = new ArrayList<>();

        words.add(new NativeWord("How are you? (formal)", "Aap kaise hain?"));
        words.add(new NativeWord("Okay", "Theek hai"));
        words.add(new NativeWord("How much does this cost?", "Ye kitne ka hai?"));
        words.add(new NativeWord("How much?", "Kitna?"));
        words.add(new NativeWord("I don’t like this", "Mujhe pasand nahi hai"));
        words.add(new NativeWord("I like this", "Mujhe pasand hai"));
        words.add(new NativeWord("to make a phone call", "PHONE KAR-NAA"));
        words.add(new NativeWord("Where's the phone?", "PHONE KA-HAAN HAIN"));
        words.add(new NativeWord("What time is it?", "KYA SA-MAY HAI "));
        words.add(new NativeWord("I want drinking water", "Mujhe pine ka paani chahiye"));
        words.add(new NativeWord("Are you open tomorrow?", "(insert English word: store/ shop/ office) kal khula hai?"));
        words.add(new NativeWord("This is too expensive", "ye bahut mehenga hai / bahut jada dam hai"));
        words.add(new NativeWord("Make your price less.", "bhaav (daam) kam karo"));
        words.add(new NativeWord("I do not wish to go to that place.", "main udhar jana nehi chahta"));
        words.add(new NativeWord("I do not know...", "mujhe malum nehi "));
        words.add(new NativeWord("tea", "TEA or CHAI (Indian tea made in milk)"));


        NativeLangAdapter NativeLangAdapter = new NativeLangAdapter(this, words);

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(NativeLangAdapter);

    }
}
