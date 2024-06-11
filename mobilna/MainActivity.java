package com.example.mobilna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView rozmiarTextView;
    TextView cytatTextView;
    SeekBar seekBar;
    Button zmienCytatButton;

    String[] cytaty = {"Dzień Dobry", "Good morning", "Buenos dias"};
    int obecnyIndeksCytatu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rozmiarTextView = findViewById(R.id.rozmiarTextView);
        cytatTextView = findViewById(R.id.cytatTextView);
        seekBar = findViewById(R.id.seekBar);
        zmienCytatButton = findViewById(R.id.zmienCytatButton);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                rozmiarTextView.setText("Rozmiar: " + progress);
                cytatTextView.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        zmienCytatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                obecnyIndeksCytatu = (obecnyIndeksCytatu + 1) % cytaty.length;
                cytatTextView.setText(cytaty[obecnyIndeksCytatu]);
            }
        });
    }
}