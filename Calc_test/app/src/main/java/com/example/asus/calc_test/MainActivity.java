package com.example.asus.calc_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import static android.text.TextUtils.indexOf;

public class MainActivity extends ActionBarActivity implements OnClickListener {
    public static Button btn1, btn2, btn3, btn4,
    btn5, btn6, btn7, btn8, btn9, btn0,
    btn_sum, btn_minus, btn_dividion, btn_mut, btn_equal, clear;

    public static TextView ui;
    String text = "";
    Integer result = 0;
    String buffer1 = "";
    String buffer2 = "";
    String box = "";
    String showAll ="";
    char operations ;
    Boolean wasSelected = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }

    public void init(){
        btn1 = (Button) findViewById(R.id.id1);
        btn2 = (Button) findViewById(R.id.id2);
        btn3 = (Button) findViewById(R.id.id3);
        btn4 = (Button) findViewById(R.id.id4);
        btn5 = (Button) findViewById(R.id.id5);
        btn6 = (Button) findViewById(R.id.id6);
        btn7 = (Button) findViewById(R.id.id7);
        btn8 = (Button) findViewById(R.id.id8);
        btn9 = (Button) findViewById(R.id.id9);
        btn0 = (Button) findViewById(R.id.id0);
        btn_mut = (Button) findViewById(R.id.id_mult);
        btn_minus = (Button) findViewById(R.id.id_minus);
        btn_equal = (Button) findViewById(R.id.id_equal);
        btn_dividion = (Button) findViewById(R.id.id_divid);
        btn_sum = (Button) findViewById(R.id.id_plus);
        clear = (Button) findViewById(R.id.clear);
        ui = (TextView) findViewById(R.id.textView);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btn_dividion.setOnClickListener(this);
        btn_minus.setOnClickListener(this);
        btn_equal.setOnClickListener(this);
        btn_mut.setOnClickListener(this);
        btn_sum.setOnClickListener(this);
        clear.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent = null;
        switch (id) {
            case R.id.id0:
                if (wasSelected){
                    text = text + "0";
                    buffer1 = buffer1 + '0' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "0";
                    buffer2 = buffer2 + '0' ;
                    ui.setText(buffer2);
                }

                break;
            case R.id.id1:
                if (wasSelected){
                    text = text + "1";
                    buffer1 = buffer1 + '1' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "1";
                    buffer2 = buffer2 + '1' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id2:
                if (wasSelected){
                    text = text + "2";
                    buffer1 = buffer1 + '2' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "2";
                    buffer2 = buffer2 + '2' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id3:
                if (wasSelected){
                    text = text + "3";
                    buffer1 = buffer1 + '3' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "3";
                    buffer2 = buffer2 + '3' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id4:
                if (wasSelected){
                    text = text + "4";
                    buffer1 = buffer1 + '4' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "4";
                    buffer2 = buffer2 + '4' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id5:
                if (wasSelected){
                    text = text + "5";
                    buffer1 = buffer1 + '5' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "5";
                    buffer2 = buffer2 + '5' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id6:
                if (wasSelected){
                    text = text + "6";
                    buffer1 = buffer1 + '6' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "6";
                    buffer2 = buffer2 + '6' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id7:
                if (wasSelected){
                    text = text + "7";
                    buffer1 = buffer1 + '7' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "7";
                    buffer2 = buffer2 + '7' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id8:
                if (wasSelected){
                    text = text + "8";
                    buffer1 = buffer1 + '8' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "8";
                    buffer2 = buffer2 + '8' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id9:
                if (wasSelected){
                    text = text + "9";
                    buffer1 = buffer1 + '9' ;
                    ui.setText(buffer1);
                } else {
                    text = text + "9";
                    buffer2 = buffer2 + '9' ;
                    showAll = buffer1 + operations + buffer2;
                    ui.setText(showAll);
                }
                break;
            case R.id.id_divid://  division

                wasSelected = true;
                operations = '/';
                break;
            case R.id.id_dot: // dot
                if (wasSelected){
                    char dot = '.';
                    if (Position.getPosition(buffer1, dot)){
                        text = text + ".";
                        buffer1 = buffer1 + '.' ;
                        ui.setText(buffer1);
                    }
                } else {
                    char dot = '.';
                    if (Position.getPosition(buffer1, dot)){
                        text = text + ".";
                        buffer2 = buffer2 + '.' ;
                        ui.setText(buffer2);
                    }
                }
                break;

            case R.id.id_minus:// -
                wasSelected = true;
                operations = '-';
                showAll = buffer1 + operations ;
                ui.setText(showAll);

                break;
            case R.id.id_mult:  //*
                wasSelected = true;
                operations = '*';
                showAll = buffer1 + operations ;
                ui.setText(showAll);
                break;
            case R.id.id_plus: // +

                wasSelected = true;
                operations = '+';
                showAll = buffer1 + operations ;
                ui.setText(showAll);
                break;
            case R.id.clear:
                buffer1 = "";
                buffer1 = "";
                showAll = "";
                operations = ' ';
                ui.setText("");
                break;
            case R.id.id_equal: //=
                float temp = 0;
                temp = getResult(buffer1, buffer2, operations);
                ui.setText(String.valueOf(temp));
                buffer1 = "";
                buffer1 = "";
                showAll = "";
                operations = ' ';
                break;
        }
    }

    private float getResult (String num1,String num2,char oper){
        float n1 = Integer.parseInt(num1);
        float n2 = Integer.parseInt(num2);
        float result = 0;

        switch(oper){
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;

        }

        return result;
    }
}


