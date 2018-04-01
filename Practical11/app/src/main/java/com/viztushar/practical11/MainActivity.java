package com.viztushar.practical11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText1,editText2;
    Button btPlus,btSub,btMul,btDiv;
    TextView result;
    int mResult;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);

        btPlus = findViewById(R.id.bt_plus);
        btSub = findViewById(R.id.bt_sub);
        btMul = findViewById(R.id.bt_mul);
        btDiv = findViewById(R.id.bt_div);

        result = findViewById(R.id.result);

        btPlus.setOnClickListener(this);
        btSub.setOnClickListener(this);
        btMul.setOnClickListener(this);
        btDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(editText1.getText().toString()) || TextUtils.isEmpty(editText2.getText().toString())){
            return;
        }

        num1 = Integer.parseInt(editText1.getText().toString());
        num2 = Integer.parseInt(editText2.getText().toString());

        switch (v.getId()){
            case R.id.bt_plus:
                mResult = num1 + num2;
                break;

            case R.id.bt_sub:
                mResult = num1 - num2;
                break;

            case R.id.bt_mul:
                mResult = num1 * num2;
                break;

            case R.id.bt_div:
                mResult = num1 / num2;
                break;
        }
        result.setText(String.valueOf(mResult));
    }
}
