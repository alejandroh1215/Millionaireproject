package com.example.tobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);


        Button playAgain = findViewById(R.id.button);
        playAgain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent LoginAct = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(LoginAct);
            }
        });
    }
}