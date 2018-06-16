package com.example.hlengchi.myname;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnIm,btnEx,btnSaveMain;
    EditText txtName,txtSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIm=(Button) findViewById(R.id.btnMainIm);
        btnEx=(Button) findViewById(R.id.btnMainEx);
        btnSaveMain=(Button) findViewById(R.id.btnSaveMain);


        txtName=(EditText) findViewById(R.id.txtNameMain);
        txtSex =(EditText)findViewById(R.id.txtSex);

        btnSaveMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("TXTNAME",txtName.getText().toString());
                intent.putExtra("SEX",txtSex.getText().toString());
                startActivity(intent);

            }
        });

        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });

        btnIm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent=new Intent(Intent.ACTION_VIEW);
                   // intent.setData(Uri.parse("sms:"));
                    //intent.putExtra("sms_body","I'm using my new app");

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(Intent.createChooser(sendIntent, getResources().getText(R.string.send_to)));
            }
        });


    }
}
