package com.e.smartinteraction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText un, ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        un=(EditText)findViewById(R.id.user);
        ps=(EditText)findViewById(R.id.pwd);
    }

    public void dyp(View v){
        String data = un.getText().toString();
        String data1 = ps.getText().toString();
        if(data.equals("Teacher") && data1.equals("admin123")){
            Toast.makeText(this, "Teacher Login!", Toast.LENGTH_LONG).show();
            Intent in = new Intent(this , IndexTeacher.class);
            startActivity(in);
        }
        else if (data.equals("Student") && data1.equals("admin123")){
            Toast.makeText(this, "Student Login!", Toast.LENGTH_LONG).show();
            Intent in = new Intent(this , IndexStudent.class);
            startActivity(in);
        }
        else{
            Toast.makeText( this, "Login UnSuccessful!", Toast.LENGTH_LONG).show();

        }

    }

}
