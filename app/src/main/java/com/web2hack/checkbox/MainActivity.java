package com.web2hack.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1=findViewById(R.id.checkbox1);
        checkBox2=findViewById(R.id.checkbox2);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()==true && checkBox2.isChecked()==true) {
                    Toast.makeText(MainActivity.this, "White & Red is checked", Toast.LENGTH_SHORT).show();
                } else if (checkBox2.isChecked()==true) {
                    Toast.makeText(MainActivity.this, "Red is checked", Toast.LENGTH_SHORT).show();

                } else if  (checkBox1.isChecked()==true){
                    Toast.makeText(MainActivity.this, "White is checked", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please click any Checkbox", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}