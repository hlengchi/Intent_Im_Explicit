package com.example.hlengchi.myname;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText txtName,txtSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName=findViewById(R.id.txtNameMainSecond);
        txtSex=findViewById(R.id.txtSexMainSecond);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null) {
            txtName.setText(bundle.getString("TXTNAME"));
            txtSex.setText(bundle.getString("SEX"));
            Toast.makeText(this, "Name : "+txtName.getText().toString()+" Sex : "+txtSex.getText().toString(), Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please to data", Toast.LENGTH_SHORT).show();
        }

    }
}
