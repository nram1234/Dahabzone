package com.dahabzone.android.dahabzone.Activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.dahabzone.android.dahabzone.Fragment.Hotels;
import com.dahabzone.android.dahabzone.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    FragmentManager fragmentManager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Hotels ta = new Hotels();
                      fragmentManager=getSupportFragmentManager();
                      fragmentManager.beginTransaction().replace(R.id.fragment,ta).commit();
                    return true;
                case R.id.navigation_dashboard:
                 //   mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
               //     mTextMessage.setText(R.string.title_notifications);
                    return true;
                case R.id.Shopping:
              //      mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.Nightlife:
               //     mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Hotels ta = new Hotels();
      //  fragmentManager=getSupportFragmentManager();
      //  fragmentManager.beginTransaction().replace(R.id.fragmant,ta).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
