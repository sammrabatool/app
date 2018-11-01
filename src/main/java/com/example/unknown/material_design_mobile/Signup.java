package com.example.unknown.material_design_mobile;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Signup extends AppCompatActivity {
EditText user,id,name;
Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        user=(EditText)findViewById(R.id.companyID);
        id=(EditText)findViewById(R.id.userID);
        name=(EditText)findViewById(R.id.instanceName);
        signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences=getSharedPreferences("MyPrefer",MODE_PRIVATE);
                SharedPreferences.Editor editor=sharedPreferences.edit();
                String newuser=user.getText().toString();
                String userid=id.getText().toString();
                String instance=name.getText().toString();
                editor.putString(newuser + userid + "data" , newuser + "\n" + instance);
                editor.commit();
                Intent intent=new Intent(Signup.this,otp.class);
                startActivity(intent);
            }
        });
    }
}
