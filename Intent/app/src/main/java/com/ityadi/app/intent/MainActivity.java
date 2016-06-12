package com.ityadi.app.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, middleName, lastName, mobile;
    String fName;
    String mName;
    String lName;
    String mobileNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitForm(View view) {
        firstName = (EditText) findViewById(R.id.firstName);
        middleName = (EditText) findViewById(R.id.middleName);
        lastName = (EditText) findViewById(R.id.lastName);
        mobile = (EditText) findViewById(R.id.mobile);

        fName = firstName.getText().toString();
        mName = middleName.getText().toString();
        lName = lastName.getText().toString();
        String fullName = fName+" "+mName+" "+lName;
        mobileNumber = mobile.getText().toString();

        Intent intent = new Intent(this, AnotherActivity.class);
        intent.putExtra("name", fullName);
        intent.putExtra("mobile", mobileNumber);
        startActivity(intent);


    }
}
