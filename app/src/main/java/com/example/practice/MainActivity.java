package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void click(View view){
        EditText text = findViewById(R.id.editText);
        EditText pass = findViewById(R.id.password);
        Toast.makeText(getApplicationContext(),"Username : " + text.getText().toString()+"\n" + "Password : " + pass.getText().toString(),Toast.LENGTH_LONG).show();
        Log.i("Username", text.getText().toString());
        Log.i("Password", pass.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
