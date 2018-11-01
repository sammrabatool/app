package com.example.unknown.material_design_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_main);

        //---------------generate random number for otp------------------------------------------------------
        Random r = new Random();
        int otp_code = r.nextInt(99999 - 10000) + 65;

        Toast.makeText(this, "code="+ otp_code, Toast.LENGTH_LONG).show();
        //---------------------------------------------------------------------------------------------------
    }

    /** Called when the user clicks the Login button */
    public void MoveToOPTActivity(View view) {

        Intent intent = new Intent(this, otp.class);
     //   EditText editText = (EditText) findViewById(R.id.editText);
       // String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
