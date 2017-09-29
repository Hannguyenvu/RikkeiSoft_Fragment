package com.example.hanbeo.rikkeisoft_fragment;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_StudentName fragmentStudentName = new Fragment_StudentName();
        fragmentTransaction.replace(R.id.frame_content, fragmentStudentName);
        fragmentTransaction.commit();
    }
}
