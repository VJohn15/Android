package com.example.asus.p0058_layoutbutt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btnSimple = (Button) findViewById(R.id.button);
        btnSimple.setOnClickListener(this);


       /* View.OnClickListener handler = new View.OnClickListener(){
            public void onClick(View v) {

                switch (v.getId()) {
                    case R.id.button:
                        setContentView(R.layout.app);

                        break;
                    case R.id.button2:
                        setContentView(R.layout.main);
                        break;
                }
            }
        };

        findViewById(R.id.button).setOnClickListener(handler);
        findViewById(R.id.button2).setOnClickListener(handler);*/

    }

  /*  @Override
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
    }*/

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case (R.id.button):
                intent = new Intent(getApplicationContext(), SecondActivity.class);
        }
    }
}
