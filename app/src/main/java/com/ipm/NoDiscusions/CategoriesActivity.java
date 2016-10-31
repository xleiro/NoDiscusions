package com.ipm.NoDiscusions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        CategoriesFragment categoriesFragment = (CategoriesFragment)
                getSupportFragmentManager().findFragmentById(R.id.activity_leads);

        if (categoriesFragment == null) {
            categoriesFragment = CategoriesFragment.newInstance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.activity_leads, categoriesFragment)
                    .commit();
        }
    }
}
