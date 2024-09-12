package com.example.turczakMAndriodstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button bdisable;
    private Button breset;
    private TextView counter;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        bdisable = findViewById(R.id.Bdisable);

        bdisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bdisable.setEnabled(false);
                count++;
                counter.setText("counter: " + count);
            }
        });
        breset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bdisable.setEnabled(true);
            }
        });

    }
}