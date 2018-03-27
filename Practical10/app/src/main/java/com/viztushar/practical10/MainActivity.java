package com.viztushar.practical10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mSubmit;
    EditText mUsername, mPassword, mEmail, mPhone, mInterst, mdate, mtime;
    Spinner mCountry, mState;
    RadioButton mMale, mFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmit = findViewById(R.id.submit);

        mUsername = findViewById(R.id.ed_username);
        mPassword = findViewById(R.id.ed_password);
        mEmail = findViewById(R.id.ed_email);
        mPhone = findViewById(R.id.ed_phone);
        mInterst = findViewById(R.id.ed_interst);
        mdate = findViewById(R.id.ed_date);
        mtime = findViewById(R.id.ed_time);

        mCountry = findViewById(R.id.spinnercountry);
        mState = findViewById(R.id.spinnerstate);

        mMale = findViewById(R.id.rdbt_male);
        mFemale = findViewById(R.id.rdbt_female);

        mSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, NextActivity.class);
        intent.putExtra("username", mUsername.getText().toString());
        intent.putExtra("password", mPassword.getText().toString());
        intent.putExtra("email", mEmail.getText().toString());
        intent.putExtra("phone", mPhone.getText().toString());
        intent.putExtra("interst", mInterst.getText().toString());
        intent.putExtra("date", mdate.getText().toString());
        intent.putExtra("time", mtime.getText().toString());
        intent.putExtra("country", mCountry.getSelectedItem().toString());
        intent.putExtra("state", mState.getSelectedItem().toString());

        if (mMale.isChecked())
            intent.putExtra("male", mMale.getText().toString());
        else
            intent.putExtra("female",mFemale.getText().toString());

        startActivity(intent);

    }
}
