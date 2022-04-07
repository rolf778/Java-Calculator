package com.rolf.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView showView;
    String str="0";
    double fNumber=0;
    double sNumber=0;
    int op=0;
    boolean isDotExisted=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showView=(TextView)findViewById(R.id.textView);
        showView.setText("0");
    }

    public void zeroSofar(String keyStr){
        if(str.length()==1&&str=="0")
        {
            str=keyStr;
        }else{
            str=str+keyStr;
        }
        showView.setText(str);
    }


    public void btn7Click(View view){
        zeroSofar("7");
    }
    public void btn8Click(View view){
        zeroSofar("8");
    }
    public void btn9Click(View view){
        zeroSofar("9");
    }
    public void btn4Click(View view){
        zeroSofar("4");
    }
    public void btn5Click(View view){
        zeroSofar("5");
    }
    public void btn6Click(View view){
        zeroSofar("6");
    }
    public void btn1Click(View view){
        zeroSofar("1");
    }
    public void btn2Click(View view){
        zeroSofar("2");
    }
    public void btn3Click(View view){
        zeroSofar("3");
    }
    public void btn0Click(View view){
        zeroSofar("0");
    }
    public void btnDotClick(View view){
        if(isDotExisted==false){
            str=str+".";
            showView.setText(str);
            isDotExisted=true;
        }
    }
    public void btnSignClick(View view) {

        if (str.length() == 1 && str == "0") {
            return;
        } else {
            double originalValue = Double.parseDouble(str);
            double newValue = 0 - originalValue;
            str = String.valueOf(newValue);
        }
        showView.setText(str);
    }
    public void btnACClick(View view){
        str="0";
        showView.setText(str);
        fNumber=0;
        sNumber=0;
        op=0;
        isDotExisted=false;
    }
    public void btnDELClick(View view){
        if(str.length()>1){
            str=str.substring(0,str.length()-1);
        }else{
            str="0";
        }
        showView.setText(str);
    }
    public void btnDivideClick(View view){
        fNumber=Double.parseDouble(str);
        str="0";

        op=4;
    }
    public void btnMultiplyClick(View view){
        fNumber=Double.parseDouble(str);
        str="0";

        op=3;
    }
    public void btnAddClick(View view){
        fNumber=Double.parseDouble(str);
        str="0";

        op=1;
    }
    public void btnMinusClick(View view){
        fNumber=Double.parseDouble(str);
        str="0";

        op=2;
    }
    public void btnEqualClick(View view){
        sNumber=Double.parseDouble(str);
        double total=0;
        switch(op){
            case 1:
                total=fNumber+sNumber;
                break;
            case 2:
                total=fNumber-sNumber;
                break;
            case 3:
                total=fNumber*sNumber;
                break;
            case 4:
                total=fNumber/sNumber;
                break;
            default:break;
        }
        str=String.valueOf(total);
        showView.setText(str);

    }


}