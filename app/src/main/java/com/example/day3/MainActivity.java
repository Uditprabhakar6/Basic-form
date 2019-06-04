package com.example.day3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fname,lname;
Button Submit;
TextView fullname;
private Button contactus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        fullname=(TextView)findViewById(R.id.fullname);
        Submit=(Button)findViewById(R.id.submit);
        contactus=(Button) findViewById(R.id.contactus);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname1=fname.getText().toString();
                String lname1=lname.getText().toString();
                //Toast.makeText(MainActivity.this, fname1, Toast.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this, lname1, Toast.LENGTH_LONG).show();
                if(TextUtils.isEmpty(fname1))
                {
                    fname.setError("Enter First name");
                }
                else if (TextUtils.isEmpty(lname1))
                {
                    lname.setError("Enter Second name");
                }
                else
                {
                    fullname.setText(fname1+" "+lname1);
                }


            }
        });
        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondPage();
            }
        });
        }
        public void SecondPage(){
        Intent intent = new Intent(this,SecondPage.class);
        startActivity(intent);
        }
    }


