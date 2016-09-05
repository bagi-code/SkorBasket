package com.bagi_code.www.skorbasket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity {

    private EditText inputa, inputb;
    private Button btnnext;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        inputa = (EditText) findViewById(R.id.inpta);
        inputb = (EditText) findViewById(R.id.inptb);
        btnnext = (Button) findViewById(R.id.btna1);
    }

    public void pointa1(View v) {

        String teama = String.valueOf(inputa.getText());
        String teamb = String.valueOf(inputb.getText());

        if (teama.equals("")) {
            Toast.makeText(getApplicationContext(), "Input Your Team A", Toast.LENGTH_LONG).show();
        } else if (teamb.equals("")) {
            Toast.makeText(getApplicationContext(), "Input Your Team B", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(MainActivity.this, MainUtama.class);
            String pesan[] = {teama, teamb};
            i.putExtra("pesan", pesan);
            startActivity(i);
        }
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
}
