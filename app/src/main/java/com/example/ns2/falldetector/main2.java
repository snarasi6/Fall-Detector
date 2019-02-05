package com.example.ns2.falldetector;

/**
 * Created by sriva on 12-02-2017.
 */

        import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class main2 extends Activity {
    public EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8;
Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);


            add();
    }
public void add()
{
    button = (Button) findViewById(R.id.button3);
   editText1=(EditText) findViewById(R.id.editText3);
    editText2=(EditText) findViewById(R.id.editText9);
    editText3=(EditText) findViewById(R.id.editText7);
    editText4=(EditText) findViewById(R.id.editText6);
    editText5=(EditText) findViewById(R.id.editText5);
    editText6=(EditText) findViewById(R.id.editText4);
    editText7=(EditText) findViewById(R.id.editText10);
    editText8=(EditText) findViewById(R.id.editText11);
    button.setOnClickListener(new OnClickListener() {

        @Override
        public void onClick(View arg0) {

            editText1.setText("");
            editText2.setText("");
            editText3.setText("");
            editText4.setText("");
            editText5.setText("");
            editText6.setText("");
            editText7.setText("");
            editText8.setText("");



        }

    });
}
}
