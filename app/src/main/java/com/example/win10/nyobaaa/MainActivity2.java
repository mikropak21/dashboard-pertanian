package com.example.win10.nyobaaa;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity2 extends AppCompatActivity {
        private RelativeLayout pemilik1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pemilik1 =(RelativeLayout) findViewById(R.id.pemilik1);
        pemilik1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bukaPemilik();
            }
        });

    }
    public void bukaPemilik(){
        Intent pemilik1 = new Intent(getApplicationContext(),MainActivity3.class);
        startActivity(pemilik1);
    }

}
