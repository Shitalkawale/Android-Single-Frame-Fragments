package com.example.androidfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Configuration configuration=getResources().getConfiguration();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            Landscape_fragment landscape_fragment=new Landscape_fragment();
            fragmentTransaction.replace(android.R.id.content,landscape_fragment);
        }
        else
        {
            Portrait_fragmant portrait_fragmant=new Portrait_fragmant();
            fragmentTransaction.replace(android.R.id.content,portrait_fragmant);
        }
        fragmentTransaction.commit();
    }
}