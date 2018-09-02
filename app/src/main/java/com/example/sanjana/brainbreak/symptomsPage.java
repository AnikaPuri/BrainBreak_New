package com.example.sanjana.brainbreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class symptomsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms_page);


    }
    public void toMoodSwings (View v){

        startActivity(new Intent(this, moodswings.class));
    }

    public void toDecInProd (View v){

        startActivity(new Intent(this, decinprod.class));
    }

    public void toImpulse (View v){

        startActivity(new Intent(this, impulsea.class));
    }

}

