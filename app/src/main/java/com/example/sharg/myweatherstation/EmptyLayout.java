package com.example.sharg.myweatherstation;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class EmptyLayout extends AppCompatActivity {
    private FragmentTransaction ft;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_list:
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.active_fragment, new EmptyFragment());
                    ft.commit();
                    break;
                case R.id.navigation_data:
                    ft = getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.active_fragment, new DataFragment());
                    ft.commit();
                    break;
                case R.id.navigation_search:
                    break;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty_layout);

        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.active_fragment, new EmptyFragment());
        ft.commit();

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


}
