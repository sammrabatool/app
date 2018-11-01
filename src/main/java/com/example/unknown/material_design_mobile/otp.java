package com.example.unknown.material_design_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

public class otp extends AppCompatActivity {

    EditText opt_code1,opt_code2,opt_code3,opt_code4,opt_code5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_screen);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
     //   String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
      //  TextView textView = findViewById(R.id.textView);
      //  textView.setText(message);



        //----------------------set focus of edit texts------------------------------------------------------
        opt_code1=(EditText)findViewById(R.id.optCode1);
        opt_code2=(EditText)findViewById(R.id.optCode2);
        opt_code3=(EditText)findViewById(R.id.optCode3);
        opt_code4=(EditText)findViewById(R.id.optCode4);
        opt_code5=(EditText)findViewById(R.id.optCode5);

        opt_code1.addTextChangedListener( new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (opt_code1.getText().toString().length() == 1)     //size as per your requirement
                {
                    opt_code2.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        opt_code2.addTextChangedListener( new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (opt_code2.getText().toString().length() == 1)     //size as per your requirement
                {
                    opt_code3.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        opt_code3.addTextChangedListener( new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (opt_code3.getText().toString().length() == 1)     //size as per your requirement
                {
                    opt_code4.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });

        opt_code4.addTextChangedListener( new TextWatcher() {


            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
                if (opt_code4.getText().toString().length() == 1)     //size as per your requirement
                {
                    opt_code5.requestFocus();
                }
            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
                // TODO Auto-generated method stub

            }

            public void afterTextChanged(Editable s) {
                // TODO Auto-generated method stub
            }
        });
    }

    /** Called when the user taps the Login button */
    public void MoveToLoginActivity(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, LoginActivity.class);
        //   EditText editText = (EditText) findViewById(R.id.editText);
        // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    }

