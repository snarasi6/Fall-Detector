package com.example.ns2.falldetector;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button button,button1;
    public EditText user,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText) findViewById(R.id.editText) ;
        pwd=(EditText) findViewById(R.id.editText2) ;


        addListenerOnButton();
    }
    public void OnLogin(View view)
    {
        String username = user.getText().toString();
        String password = pwd.getText().toString();
        String type = "login";
        signin sign = new signin(this);



       //signin.execute(type, username, password);
    }

    public void addListenerOnButton() {

        final Context context = this;

        button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, main2.class);//registerhere
                startActivity(intent);

            }

        });

        button1= (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, main_nav.class);
                startActivity(intent);

            }

        });
    }
}
