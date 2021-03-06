package com.example.asus.p0060_androidmenu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
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
        //if (id == R.id.action_settings) {

            switch (id){
                case R.id.action_settings:
                    Toast.makeText(MainActivity.this, getString(R.string.action_settings), Toast.LENGTH_LONG).show();
                    break;
                case R.id.action_item1:
                    Toast.makeText(MainActivity.this, getString(R.string.action_item1), Toast.LENGTH_LONG).show();
                    break;
                case R.id.action_item2:
                    Toast.makeText(MainActivity.this, getString(R.string.action_item2), Toast.LENGTH_LONG).show();
                    break;
                case R.id.action_item3:
                    Toast.makeText(MainActivity.this, getString(R.string.action_item3), Toast.LENGTH_LONG).show();
                    break;


            }

        return super.onOptionsItemSelected(item);
    }
}
