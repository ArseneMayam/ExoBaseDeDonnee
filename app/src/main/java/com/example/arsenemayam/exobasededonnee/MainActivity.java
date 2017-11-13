package com.example.arsenemayam.exobasededonnee;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Context ctx;
    Button addBttn;
    EditText inputNom;
    EditText inputPrenom;
    EditText inputAge;
    ListView maListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;

        addBttn =(Button)findViewById(R.id.bttnAdd);
        inputNom =(EditText) findViewById(R.id.inputNom);
        inputPrenom = (EditText) findViewById(R.id.inputPrenom);
        inputAge = (EditText) findViewById(R.id.inputAge);
        maListView = (ListView) findViewById(R.id.maListView);


        addBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
