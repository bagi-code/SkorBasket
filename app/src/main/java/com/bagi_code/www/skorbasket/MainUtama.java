package com.bagi_code.www.skorbasket;

/**
 * Created by rdp10007 on 9/29/2015.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainUtama extends ActionBarActivity {

    private Button btna3, btna2, btna1, btnb3, btnb2, btnb1, btnreset;
    private TextView teama, teamb;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        btna1 = (Button) findViewById(R.id.btna1);
        btna2 = (Button) findViewById(R.id.btna2);
        btna3 = (Button) findViewById(R.id.btna3);
        btnb1 = (Button) findViewById(R.id.btnb1);
        btnb2 = (Button) findViewById(R.id.btnb2);
        btnb3 = (Button) findViewById(R.id.btnb3);
        btna3 = (Button) findViewById(R.id.btnreset);

        teama = (TextView) findViewById(R.id.namateama);
        teamb = (TextView) findViewById(R.id.namateamb);

        //mengambil nama gedung
        Intent i = this.getIntent();
        String pesan[] = i.getStringArrayExtra("pesan");

        teama.setText(pesan[0]);
        teamb.setText(pesan[1]);

    }

    public void pointa3(View v) {
        TextView score = (TextView) findViewById(R.id.scorteama);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 3));
    }

    public void pointb3(View v) {
        TextView score = (TextView) findViewById(R.id.scorteamb);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 3));
    }

    public void pointa2(View v) {
        TextView score = (TextView) findViewById(R.id.scorteama);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 2));
    }

    public void pointb2(View v) {
        TextView score = (TextView) findViewById(R.id.scorteamb);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 2));
    }

    public void pointa1(View v) {
        TextView score = (TextView) findViewById(R.id.scorteama);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 1));
    }

    public void pointb1(View v) {
        TextView score = (TextView) findViewById(R.id.scorteamb);
        String Score = (String) score.getText();
        int nilai = Integer.parseInt(Score);
        score.setText(String.valueOf(nilai + 1));
    }

    public void pointreset(View v) {
        TextView score = (TextView) findViewById(R.id.scorteamb);
        score.setText(String.valueOf(0));

        TextView score1 = (TextView) findViewById(R.id.scorteama);
        score1.setText(String.valueOf(0));
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
