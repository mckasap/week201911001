package org.kasapbasi.week20191101;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void myTik(View v){
    Intent in = new Intent(MainActivity.this,MyService.class);
    startService(in);

}

public void myTikStop(View v){
    Intent in = new Intent(MainActivity.this,MyService.class);
    stopService(in);

}
}
