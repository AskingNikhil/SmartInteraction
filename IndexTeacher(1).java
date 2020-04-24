package com.e.smartinteraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IndexTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_index);
    }

    public void marks_t (View v){
        Intent inm = new Intent(this , TeacherMarklist.class);
        startActivity(inm);
    }
    public void aboutus (View v){
        Intent ina = new Intent(this , AboutUs.class);
        startActivity(ina);
    }
    public void default_t (View v){
        Intent ind = new Intent(this , TeacherDefaulter.class);
        startActivity(ind);
    }
    public void assign_t (View v){
        Intent inas = new Intent(this , TeacherDefaulter.class);
        startActivity(inas);
    }
}
