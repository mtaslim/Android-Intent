package com.ityadi.app.intent;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        String name = getIntent().getStringExtra("name");
        String mobile = getIntent().getStringExtra("mobile");
        Toast.makeText(AnotherActivity.this, name, Toast.LENGTH_SHORT).show();


        /*btnCall = (Button)findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AnotherActivity.this, "aaa", Toast.LENGTH_LONG).show();
            }
        });*/

    }

    public void GoPreviousPage(View view) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }

    public void MakePhoneCall(View view) {
        String mobile = getIntent().getStringExtra("mobile");

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+mobile));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        startActivity(callIntent);
    }







}
