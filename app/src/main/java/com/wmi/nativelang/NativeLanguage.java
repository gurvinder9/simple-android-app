package com.wmi.nativelang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wmi.simplefunfacts.R;

public class NativeLanguage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native_language);

        TextView colors = (TextView) findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsActivity = new Intent(NativeLanguage.this, ColorsActivity.class);
                startActivity(colorsActivity);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesActivity = new Intent(NativeLanguage.this, PhrasesActivity.class);
                startActivity(phrasesActivity);
            }
        });

    }
}
