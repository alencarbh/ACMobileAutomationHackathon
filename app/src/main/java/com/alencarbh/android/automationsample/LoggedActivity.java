package com.alencarbh.android.automationsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoggedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);

        String srtEmail = getIntent().getStringExtra("email");
        TextView txtVwEmail = (TextView) findViewById(R.id.email);
        txtVwEmail.setText(srtEmail);
    }
}
