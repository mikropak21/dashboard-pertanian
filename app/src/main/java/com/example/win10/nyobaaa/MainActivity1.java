package com.example.win10.nyobaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.support.v7.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {
    private RelativeLayout padi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        padi =(RelativeLayout) findViewById(R.id.padi);
        padi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaPadi();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void bukaPadi(){
        Intent page2 = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(page2);
    }

}