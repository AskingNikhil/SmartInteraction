package com.e.smartinteraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IndexStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_index);
    }

    public void marks (View v){
        Intent inms = new Intent(this , DownloadMarklist.class);
        startActivity(inms);
    }
    public void abtus (View v){
        Intent inab = new Intent(this , AboutUs.class);
        startActivity(inab);
    }
    public void default_s (View v){
        Intent inde = new Intent(this , DownloadDefaulter.class);
        startActivity(inde);
    }
    public void assign (View v){
        Intent inass = new Intent(this , DownloadAssignment.class);
        startActivity(inass);
    }
}
