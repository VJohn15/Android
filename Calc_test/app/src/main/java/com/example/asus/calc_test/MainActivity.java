package com.example.asus.calc_test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import org.w3c.dom.Text;

public class MainActivity extends ActionBarActivity implements OnClickListener {
    public static Button btn1, btn2, btn3, btn4,
    btn5, btn6, btn7, btn8, btn9, btn0,
    btn_sum, btn_minus, btn_dividion, btn_mut, btn_equal;
    String text = "";
    Integer result = 0;
    String buffer = "";


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
        btn_mut = (Button) findViewById(R.id.id_mult);
        btn_minus = (Button) findViewById(R.id.id_minus);
        btn_equal = (Button) findViewById(R.id.id_equal);
        btn_dividion = (Button) findViewById(R.id.id_divid);
        btn_sum = (Button) findViewById(R.id.id_plus);

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
                text = text + "0";
                buffer = buffer + '0' ;
                break;
            case R.id.id1:
                text = text + "1";
                buffer = buffer +  '1' ;
                break;
            case R.id.id2:
                text = text + "2";
                buffer = buffer + '2' ;
                break;
            case R.id.id3:
                text = text + "3";
                buffer = buffer + '3' ;
                break;
            case R.id.id4:
                text = text + "4";
                buffer = buffer + '4' ;
                break;
            case R.id.id5:
                text = text + "5";
                buffer = buffer + '5' ;
                break;
            case R.id.id6:
                text = text + "6";
                buffer = buffer + '6' ;
                break;
            case R.id.id7:
                text = text + "7";
                buffer = buffer + '7' ;
                break;
            case R.id.id8:
                text = text + "8";
                buffer = buffer + 8 ;
                break;
            case R.id.id9:
                text = text + "9";
                buffer = buffer + 9 ;
                break;
            case R.id.id_divid:
                result = result / Integer.parseInt(buffer) ;
                buffer = "";
                break;
            case R.id.id_dot:

                break;
            case R.id.id_equal:
                //result = result / buffer ;
                //TODO: just refresh result view
                buffer = "";
                break;
            case R.id.id_minus:
                result = result - Integer.parseInt(buffer) ;
                break;
            case R.id.id_mult:
                result = result * Integer.parseInt(buffer) ;
                break;
            case R.id.id_plus:
                result = result + Integer.parseInt(buffer) ;
                break;
        }
    }
}


