package com.example.exbuttontextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // This method is called when the button is clicked
    public void onBtnClick (View vew){
        // Access to the textView and EditText
        TextView txtHello = findViewById(R.id.txtMessage);
        //Set the text to the textView
        txtHello.setText("Hello There!!");

    }
}