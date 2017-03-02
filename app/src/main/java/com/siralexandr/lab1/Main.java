package com.siralexandr.lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements View.OnClickListener{
    TextView tv;
    Toast t;
    boolean first=true;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bPlus,bMinus,bMult,bDiv,bC,bDot,bEqual,bSQRT,b1X,bPlusMinus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        b0=(Button)findViewById(R.id.button0);
        b0.setOnClickListener(this);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.button7);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(this);
        bPlus=(Button)findViewById(R.id.buttonPlus);
        bPlus.setOnClickListener(this);
        bMinus=(Button)findViewById(R.id.buttonMinus);
        bMinus.setOnClickListener(this);
        bMult=(Button)findViewById(R.id.buttonMult);
        bMult.setOnClickListener(this);
        bDiv=(Button)findViewById(R.id.buttonDiv);
        bDiv.setOnClickListener(this);
        bC=(Button)findViewById(R.id.buttonC);
        bC.setOnClickListener(this);
        bDot=(Button)findViewById(R.id.buttonDot);
        bDot.setOnClickListener(this);
        bEqual=(Button)findViewById(R.id.buttonEqual);
        bEqual.setOnClickListener(this);
        bSQRT=(Button)findViewById(R.id.buttonSqrt);
        bSQRT.setOnClickListener(this);
        b1X=(Button)findViewById(R.id.button1X);
        b1X.setOnClickListener(this);
        bPlusMinus=(Button)findViewById(R.id.buttonPlusMinus);
        bPlusMinus.setOnClickListener(this);

        double First=0;
        double Second=0;

    }
    public double getCurrentNum(){
        if(!first){
            double d=Double.valueOf(tv.getText().toString()).doubleValue();
        return d;}
        else {return 0;}
    }
    @Override
    public void onClick(View v) {

        if(first) {
            tv.setText("");
            first=!first;
        }
        switch (v.getId()) {

            case R.id.button0:
double d=getCurrentNum();

                if(getCurrentNum()!=0) {
                    tv.setText(tv.getText() + ((Button) v).getText().toString());
                }
                else{
                   t = Toast.makeText(getApplicationContext(),
                            "Два нуля!", Toast.LENGTH_SHORT);
                    t.show();
                }
                break;

            case R.id.buttonMult:
                // do your code
                break;

            case R.id.buttonDiv:
                // do your code
                break;

            case R.id.buttonPlus:
                // do your code
                break;
            case R.id.buttonMinus:
                // do your code
                break;

            case R.id.buttonDot:
                // do your code
                break;

            case R.id.buttonC:
                // do your code
                break;

            case R.id.buttonPlusMinus:
                // do your code
                break;

            case R.id.button1X:
                // do your code
                break;
            case R.id.buttonSqrt:
                // do your code
                break;

            case R.id.buttonEqual:
                // do your code
                break;

            default:
                tv.setText(tv.getText() + ((Button) v).getText().toString());
                break;
        }
    }
}
