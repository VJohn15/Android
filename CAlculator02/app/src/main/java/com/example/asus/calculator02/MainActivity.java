package com.example.asus.calculator02;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


import java.util.EnumMap;

public class MainActivity extends ActionBarActivity implements OnClickListener{


    private EditText textResult;

    private  Button btnAdd;
    private  Button btnSubtract;
    private  Button btnMultiply;
    private  Button btnDivide;


    private OperationType operType;
    private EnumMap < Symbol, Object> commans = new EnumMap < Symbol, Object > (Symbol.class);



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textResult = (EditText) findViewById(R.id.editText);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(this);

        btnAdd.setTag(OperationType.ADD);
        btnSubtract.setTag(OperationType.SUBTRACT);
        btnMultiply.setTag(OperationType.MULTIPLY);
        btnDivide.setTag(OperationType.DIVIDE);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void buttonClick(View v) {


        switch (v.getId()) {
            case R.id.btnAdd:
            case R.id.btnSubtract:
            case R.id.btnMultiply:
            case R.id.btnDivide: {

                 operType = (OperationType) v.getTag();

                if (!commans.containsKey(Symbol.OPERATION)) {

                    if (!commans.containsKey(Symbol.FIRST_DIGIT)) {
                        commans.put(Symbol.FIRST_DIGIT, textResult.getText());
                    }

                    commans.put(Symbol.OPERATION, operType);
                } else if (!commans.containsKey(Symbol.SECOND_DIGIT)) {
                    commans.put(Symbol.SECOND_DIGIT, textResult.getText());
                    doCalc();
                    commans.put(Symbol.OPERATION, operType);
                    commans.remove(Symbol.SECOND_DIGIT);

                }

                break;
            }

            case R.id.btnClear:
                textResult.setText("0");
                commans.clear();
                break;
        }
        switch (v.getId()) {
            case R.id.btnResult: {

                if (commans.containsKey(Symbol.FIRST_DIGIT) && commans.containsKey(Symbol.OPERATION)) {
                    commans.put(Symbol.SECOND_DIGIT, textResult.getText());

                    doCalc();

                    commans.put(Symbol.OPERATION, operType);
                    commans.remove(Symbol.SECOND_DIGIT);
                }
                break;
            }

            case R.id.btnComma: {
                if (commans.containsKey(Symbol.FIRST_DIGIT)&&
                        getDouble(textResult.getText().toString()) == getDouble(commans.get(Symbol.FIRST_DIGIT).toString())){

                    textResult.setText("0" + v.getContentDescription().toString());
                }
                if (!textResult.getText().toString().contains(",")){
                    textResult.setText(textResult.getText() + ",");
                }
                break;
            }

            case R.id.btnDelete: {
                textResult.setText(textResult.getText().delete(textResult.getText().length() - 1,
                        textResult.getText().length()));

                if (textResult.getText().toString().trim().length() == 0){
                    textResult.setText("0");
                }
                break;

            }

            default: {
                if (textResult.getText().toString().equals("0") || (commans.containsKey(Symbol.FIRST_DIGIT) && getDouble
                        (textResult.getText()) == getDouble(commans.get(Symbol.FIRST_DIGIT)))){
                    textResult.setText(v.getContentDescription().toString());
                }  else {
                    textResult.setText(textResult.getText() + v.getContentDescription().toString());
                }
            }

        }
    }

    private double getDouble(Object value){
        double result = 0;
        try {
            result = Double.valueOf(value.toString().replace(',','.')).doubleValue();
        } catch (Exception ex){
            ex.printStackTrace();
            result = 0;
        }
         return result;

    }

    private void doCalc(){
        OperationType operTypeTemporary = (OperationType) commans.get(Symbol.OPERATION);

        double result = calc(operTypeTemporary,
                getDouble(commans.get(Symbol.FIRST_DIGIT)), getDouble (commans.get(Symbol.SECOND_DIGIT)));


        if (result % 1 == 0){
            textResult.setText(String.valueOf((int)result));
        } else {
            textResult.setText(String.valueOf(result));
        }
        commans.put(Symbol.FIRST_DIGIT, result);
    }

    private Double calc (OperationType operType, double a, double b) {
        switch (operType) {
            case ADD: {
                return CalcOperation.add(a, b);
            }
            case SUBTRACT: {
                return CalcOperation.subtract(a, b);
            }
            case MULTIPLY: {
                return CalcOperation.multiply(a, b);
            }
            case DIVIDE: {
                return CalcOperation.divide(a, b);
            }
        }

        return null;


    }

    @Override
    public void onClick(View v) {
        int id= v.getId();


        }
    }

