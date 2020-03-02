package com.example.hospitalpatientsindex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.annotation.Nullable;

import ch.hevs.linearlayout.R;

public class EnterPatientInfo extends Activity {

    //should still add a picture variable
    private ImageButton imageButton;
    private Button submit;
    private EditText firstName;
    private EditText lastName;
    private EditText address;
    private EditText npa;
    private EditText city;
    private EditText country;
    private EditText birthdate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info);

        imageButton = (ImageButton)  findViewById(R.id.btn_image);
        submit = (Button) findViewById(R.id.btn_submit);
        firstName = (EditText) findViewById(R.id.et_firstname);
        lastName = (EditText) findViewById(R.id.et_lastname);
        address = (EditText) findViewById(R.id.et_address);
        city = (EditText) findViewById(R.id.et_city);
        country = (EditText) findViewById(R.id.et_country);
        birthdate = (EditText) findViewById(R.id.et_birthdate);

        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterPatientInfo.this, ShowPatientInfo.class);
                //intent.putExtra("firstname", imageButton..getText().toString());
                intent.putExtra("firstname", firstName.getText().toString());
                intent.putExtra("lastname", lastName.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("city", city.getText().toString());
                intent.putExtra("country", country.getText().toString());
                intent.putExtra("birthdate", birthdate.getText().toString());

                EnterPatientInfo.this.startActivity(intent);
            }
        });
    }
}
