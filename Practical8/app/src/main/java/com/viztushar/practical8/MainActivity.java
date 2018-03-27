package com.viztushar.practical8;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    // buttons
    Button bt1, bt2, bt3;
    Button mShowDialogBox;
    //listview
    ListView lv;
    //list items
    String[] listitems = {"Music","Movies","Reading","Game","Sports"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // layout file
        setContentView(R.layout.activity_main);

        // find all view that are in xml files
        bt1 = findViewById(R.id.button2);
        bt2 = findViewById(R.id.button3);
        bt3 = findViewById(R.id.button4);
        lv = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listitems);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //add listitem into the listview
        lv.setAdapter(arrayAdapter);

        //Item Click Listener for listview
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "you click on " + lv.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                Log.e(TAG, "onItemSelected: " + lv.getItemAtPosition(position).toString());
            }
        });

        mShowDialogBox = findViewById(R.id.showdialogbox);


        //click listener
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);

        mShowDialogBox.setOnClickListener(this);
    }

    //all click events
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button2:
                Toast.makeText(MainActivity.this, "you click on " + bt1.getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(MainActivity.this, "you click on " + bt2.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Toast.makeText(MainActivity.this, "you click on " + bt3.getText(), Toast.LENGTH_SHORT).show();
                break;

            case R.id.showdialogbox:
                ShowDialogBox();
                break;

        }

    }

    // Dialog box
    private void ShowDialogBox(){

        AlertDialog dialog = new AlertDialog.Builder(MainActivity.this).create();
        dialog.setTitle("Dialog Box");
        dialog.setMessage("message");
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
