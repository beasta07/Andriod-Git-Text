package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Key;

public class MainActivity extends AppCompatActivity {

    String program = "BCA";

    EditText TextPassword, TextEmail;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextEmail = findViewById(R.id.TextEmail);
        TextPassword = findViewById(R.id.TextPassword);
        button = findViewById(R.id.btn);
        Log.d(program, "onCreate: ");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validateEmail(TextEmail);

                Intent i = new Intent(MainActivity.this,Activity2.class);
                i.putExtra("Key","Megan");
                startActivity(i);

            }

        });

    }

    private boolean validateEmail(EditText TextEmail) {
        String emailInput = TextEmail.getText().toString();
        String passwordInput = TextPassword.getText().toString();

        if(!emailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            Toast.makeText(this, "Email valid", Toast.LENGTH_SHORT).show();
            return true;
        }else if (!passwordInput.isEmpty() && passwordInput.length()<=5){
            Toast.makeText(this, "Password valid", Toast.LENGTH_SHORT).show();
            return true;
        }
        else{
            Toast.makeText(this, "Not valid", Toast.LENGTH_SHORT).show();
            return false;
        }
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(program, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(program, "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(program, "onRestart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(program, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(program, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(program, "onDestroy: ");
    }
}