package com.example.materstoinch;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText number;
    private Button converrt;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.edittex);
        converrt = findViewById(R.id.btn);
        result = findViewById(R.id.result);

        converrt.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            //convert logic
                                            double sm = 10172.76;
                                            double finalResult = 0;
                                            double edtResult = Double.parseDouble(number.getText().toString());

                                            finalResult = sm * edtResult;

                                            result.setText(String.valueOf(finalResult + " SO'M"));

                                        }
                                    }
        );
    } }