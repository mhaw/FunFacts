package com.example.mikehaw.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook factbook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    // declare view variables

    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // assign views from the layout file to the corresponding variables

        factTextView = findViewById(R.id.factTextView);

        showFactButton = findViewById(R.id.showFactButton);

        relativeLayout = findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = factbook.getFact();
                int color = colorWheel.getColor();

                // update the screen with new fact
                relativeLayout.setBackgroundColor(color);
                factTextView.setText(fact);
                showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);

    }


}