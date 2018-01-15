package com.wmi.simplefunfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FunFact showFacts = new FunFact();
    private ShowBgColors showColors = new ShowBgColors();

    private TextView getTextView;
    private Button getButton;
    private RelativeLayout getScreenLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getTextView = (TextView) findViewById(R.id.factTextView);
        getButton = (Button) findViewById(R.id.showFactButton);
        getScreenLayout = (RelativeLayout) findViewById(R.id.funfactlayout);

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = showFacts.getFacts();

                getTextView.setText(fact);
                getScreenLayout.setBackgroundColor(showColors.getRandomColors());
                getButton.setTextColor(showColors.getRandomColors());
            }
        });


    }


}
