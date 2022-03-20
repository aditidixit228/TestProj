package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    TextView title_text;
    EditText show_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goRed(View view){
        button2=findViewById(R.id.blue_button);
        button2.setBackgroundColor(0xFFBB86FC);

    }
    public void changeColour(View view){
        button1=findViewById(R.id.brown_button);
        button1.setBackgroundColor(0xFFBB86FC);
        title_text=findViewById(R.id.welcom_text);
        title_text.setText("Welcome to Aditi App\n");
        show_text=findViewById(R.id.input_text);
        String input=show_text.getText().toString();
        title_text.setText(input);
        Toast.makeText(this, "button click",Toast.LENGTH_LONG).show();

    }
}