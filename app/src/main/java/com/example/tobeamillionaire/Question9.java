package com.example.tobeamillionaire;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question9 extends AppCompatActivity {

    private TextView question;
    private TextView moneyMade;
    private Button AnsA;
    private Button AnsB;
    private Button AnsC;
    private Button AnsD;

    public static int totalMoney = Question8.totalMoney;
    public static int totalRight = Question8.totalRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);

        moneyMade = (TextView)findViewById(R.id.questionnum);
        question = (TextView)findViewById(R.id.question);
        AnsA = (Button)findViewById(R.id.AnsA);
        AnsB = (Button)findViewById(R.id.AnsB);
        AnsC = (Button)findViewById(R.id.AnsC);
        AnsD = (Button)findViewById(R.id.CashOut);

        moneyMade.setText("You Earned : $ "+ totalMoney); //question num TextView update

        question.setText("What is the minimum number of six-packs one would need to buy in order to put “99 bottles of beer on the wall” ?");   //set the question

        AnsA.setText("15");  // set answer choices
        AnsB.setText("16");
        AnsC.setText("17");


        AnsA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Wrong Answer - Sorry! You lost and your earnings have been cut" , Toast.LENGTH_LONG ).show();
                Intent newQues = new Intent(getApplicationContext(), LoserActivity.class);
                startActivity(newQues);
            }
        });
        AnsB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Wrong Answer - Sorry! You lost and your earnings have been cut" , Toast.LENGTH_LONG ).show();
                Intent newQues = new Intent(getApplicationContext(), LoserActivity.class);
                startActivity(newQues);
            }
        });
        AnsC.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Correct! You earned $" + totalMoney + " !!!" , Toast.LENGTH_LONG ).show();
                totalMoney *= 2;  //double the money for the right answer
                totalRight += 1;  //counts how many you got right
                Intent newQues = new Intent(getApplicationContext(), Question10.class);
                startActivity(newQues);
            }
        });
        AnsD.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Congrats you have safely cashed out without losing earnings!!" , Toast.LENGTH_LONG ).show();
                Intent newQues = new Intent(getApplicationContext(), CashOut.class);
                startActivity(newQues);
            }
        });
    }
}