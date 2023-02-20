package com.example.calculatepro;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,buttondot,buttonequal,buttonreset,buttonplus,buttonminus,buttonmul,buttondevide,buttonplusminus,buttonpercentage;
    TextView textView;

    float mValueOne, mValueTwo;
    boolean textAddition, textSubtract, textMultiplication, textDivision,textPercentage,textpow;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.zero);
        button1=findViewById(R.id.one);
        button2=findViewById(R.id.two);
        button3=findViewById(R.id.three);
        button4=findViewById(R.id.four);
        button5=findViewById(R.id.five);
        button6=findViewById(R.id.six);
        button7=findViewById(R.id.seven);
        button8=findViewById(R.id.eight);
        button9=findViewById(R.id.nine);

        buttondot=findViewById(R.id.point);
        buttonequal=findViewById(R.id.equal);
        buttonreset=findViewById(R.id.ac);
        buttonplus=findViewById(R.id.plus);
        buttonminus=findViewById(R.id.minus);
        buttonpercentage=findViewById(R.id.percenatge);
        buttonmul=findViewById(R.id.multiply);
        buttonplusminus=findViewById(R.id.plusminus);
        buttondevide=findViewById(R.id.devide);

        textView=findViewById(R.id.textView);

        button0.setOnClickListener(view -> textView.setText(textView.getText()+"0"));
        button1.setOnClickListener(view -> textView.setText(textView.getText()+"1"));
        button2.setOnClickListener(view -> textView.setText(textView.getText()+"2"));
        button3.setOnClickListener(view -> textView.setText(textView.getText()+"3"));
        button4.setOnClickListener(view -> textView.setText(textView.getText()+"4"));
        button5.setOnClickListener(view -> textView.setText(textView.getText()+"5"));
        button6.setOnClickListener(view -> textView.setText(textView.getText()+"6"));
        button7.setOnClickListener(view -> textView.setText(textView.getText()+"7"));
        button8.setOnClickListener(view -> textView.setText(textView.getText()+"8"));
        button9.setOnClickListener(view -> textView.setText(textView.getText()+"9"));


        buttonplus.setOnClickListener(view-> {
            if (textView == null) {
                assert false;
                textView.setText(null);
            } else {
                mValueOne = Float.parseFloat(textView.getText() + "");
                textAddition = true;
                textView.setText(null);
            }
        });

        buttonminus.setOnClickListener(view -> {
            if (textView == null) {
                assert false;
                textView.setText(null);
            } else {
                mValueOne = Float.parseFloat(textView.getText() + "");
                textSubtract = true;
                textView.setText(null);
            }
        });

        buttonmul.setOnClickListener(view -> {
            if (textView == null) {
                assert false;
                textView.setText(null);
            } else {
                mValueOne = Float.parseFloat(textView.getText() + "");
                textMultiplication = true;
                textView.setText(null);
            }
        });

        buttondevide.setOnClickListener(view -> {
            if (textView == null) {
                assert false;
                textView.setText(null);
            } else {
                mValueOne = Float.parseFloat(textView.getText() + "");
                textDivision = true;
                textView.setText(null);
            }


        });

        buttonpercentage.setOnClickListener(view->{
            if(textView==null)
            {
                assert false;
                textView.setText(null);
            }
            else{
                mValueOne= Float.parseFloat(textView.getText()+"");
                textPercentage=true;
                textView.setText(null);
            }
        });

        buttonplusminus.setOnClickListener(view -> {
            if(textView==null)
            {
                assert false;
                textView.setText(null);
            }
            else{
                mValueOne=Float.parseFloat(textView.getText()+"");
                textpow=true;
                textView.setText(null);
            }
        });



        buttonequal.setOnClickListener(view -> {
         mValueTwo=Float.parseFloat(textView.getText()+"");
            if(textAddition)
            {
                textView.setText(mValueOne+mValueTwo+"");
                textAddition=false;
            }

            if(textSubtract)
            {
                textView.setText(mValueOne-mValueTwo+"");
                textSubtract=false;
            }

            if(textMultiplication)
            {
                textView.setText(mValueOne*mValueTwo+"");
                textMultiplication=false;
            }

            if(textDivision)
            {
                textView.setText(mValueOne/mValueTwo+"");
                textDivision=false;
            }

            if(textPercentage )
            {
                textView.setText((mValueOne*mValueTwo)/100+"");
                textPercentage=false;
            }
            if(textpow)
            {
                textView.setText(Math.pow(mValueOne,mValueTwo)+"");
                textpow=false;
            }
        });

        buttonreset.setOnClickListener(view -> textView.setText(""));


        buttondot.setOnClickListener(view -> textView.setText(textView.getText()+"."));




    }

}