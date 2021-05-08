package com.example.tobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoserActivity extends AppCompatActivity {

    private TextView moneyMade;

    public static int ques1 = HomeActivity.totalMoney;
    public static int ques2 = Question2.totalMoney;
    public static int ques3 = Question3.totalMoney;
    public static int ques4 = Question4.totalMoney;
    public static int ques5 = Question5.totalMoney;
    public static int ques6 = Question6.totalMoney;
    public static int ques7 = Question7.totalMoney;
    public static int ques8 = Question8.totalMoney;
    public static int ques9 = Question9.totalMoney;
    public static int ques10 = Question10.totalMoney;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);

        moneyMade = (TextView)findViewById(R.id.questionnum);
        moneyMade.setText("You Earned : $ "+ ques1);

        if(ques2 > ques1){
            moneyMade.setText("You Earned : $ "+ ques2/10);
        }
        if(ques3 > ques2){
            moneyMade.setText("You Earned : $ "+ ques3/10);
        }
        if(ques4 > ques3){
            moneyMade.setText("You Earned : $ "+ ques4/10);
        }
        if(ques5 > ques4){
            moneyMade.setText("You Earned : $ "+ ques5/10);
        }
        if(ques6 > ques5){
            moneyMade.setText("You Earned : $ "+ ques6/10);
        }
        if(ques7 > ques6){
            moneyMade.setText("You Earned : $ "+ ques7/10);
        }
        if(ques8 > ques7){
            moneyMade.setText("You Earned : $ "+ ques8/10);
        }
        if(ques9 > ques8) {
            moneyMade.setText("You Earned : $ " + ques9/10);
        }
        if(ques10 > ques9) {
            moneyMade.setText("You Earned : $ " + ques10/10);
        }

        Button playAgain = findViewById(R.id.button);
        playAgain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent LoginAct = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(LoginAct);
            }
        });
    }
}