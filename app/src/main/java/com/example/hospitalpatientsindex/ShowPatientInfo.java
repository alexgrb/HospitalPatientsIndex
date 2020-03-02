package com.example.hospitalpatientsindex;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import ch.hevs.linearlayout.R;

public class ShowPatientInfo extends Activity {
    private TextView firstname;
    private TextView lastname;
    private TextView address;
    private TextView city;
    private TextView country;
    private TextView birthdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_patient);

        Intent intent = getIntent();

        firstname = (TextView) findViewById(R.id.tv_firstName);
        lastname = (TextView) findViewById(R.id.tv_lastName);
        address = (TextView) findViewById(R.id.tv_address);
        city = (TextView) findViewById(R.id.tv_city);
        country = (TextView) findViewById(R.id.tv_country);
        birthdate = (TextView) findViewById(R.id.tv_birthdate);

        firstname.setText(intent.getStringExtra("firstname"));
        lastname.setText(intent.getStringExtra("lastname"));
        address.setText(intent.getStringExtra("address"));
        city.setText(intent.getStringExtra("city"));
        country.setText(intent.getStringExtra("country"));
        birthdate.setText(intent.getStringExtra("birthdate"));

    }
}
