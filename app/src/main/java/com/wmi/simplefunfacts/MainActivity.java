package com.wmi.simplefunfacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wmi.nativelang.NativeLanguage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView getFunFactListItem = (TextView) findViewById(R.id.funfactitem);
         getFunFactListItem.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent getFunFactActivity = new Intent(MainActivity.this, FunFactActivity.class);
                 startActivity(getFunFactActivity);
             }
         });

        TextView getNativeLangItem = (TextView) findViewById(R.id.nativelang);
        getNativeLangItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent getNativeLangActivity = new Intent(MainActivity.this, NativeLanguage.class);
                startActivity(getNativeLangActivity);
            }
        });

    }


}
