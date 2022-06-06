package com.kasimkartal866.login2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class AddNewActivity extends AppCompatActivity {
    private Button btnSave;
    private EditText etFName, etLName;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String fName = etFName.getText().toString();
                User user = new User();
                user.setFName(fName);
                String lName = etLName.getText().toString();
                User user1 = new User();
                user.setLName(lName);

            }
        });
    }



}