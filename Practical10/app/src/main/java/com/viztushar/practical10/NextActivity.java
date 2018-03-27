package com.viztushar.practical10;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView textView;
    String username, password, email, phone, interst, date, time, country, state, gnd;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textView = findViewById(R.id.next_text);
        username = getIntent().getExtras().get("username").toString();
        password = getIntent().getExtras().get("password").toString();
        email = getIntent().getExtras().get("email").toString();
        phone = getIntent().getExtras().get("phone").toString();
        interst = getIntent().getExtras().get("interst").toString();
        date = getIntent().getExtras().get("date").toString();
        time = getIntent().getExtras().get("time").toString();
        country = getIntent().getExtras().get("country").toString();
        state = getIntent().getExtras().get("state").toString();
        gnd = getIntent().getExtras().get("male").toString();
        if (gnd.isEmpty())
            gnd = getIntent().getExtras().get("female").toString();

        textView.setText("username " + username + "\n" + "password " + password + "\n" +"email " + email + "\n"
                + "phone " + phone + "\n" + "interst " + interst + "\n" +"date " + date + "\n" +"time " + time + "\n"
                + "country " + country + "\n" +"state " + state + "\n");

    }
}
