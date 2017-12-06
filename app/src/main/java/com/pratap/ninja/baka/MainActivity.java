package com.pratap.ninja.baka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.pratap.ninja.baka.Activities.FirstYearNotesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void NotesMethod(View v){
        this.startActivity(new Intent(MainActivity.this, FirstYearNotesActivity.class));
    }
    public void PapersMethod(View v){

    }
    public void AssignMethod(View v){

    }
    public void EbookMethod(View v){

    }
}
