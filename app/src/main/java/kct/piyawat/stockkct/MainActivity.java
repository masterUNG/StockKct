package kct.piyawat.stockkct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kct.piyawat.stockkct.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment to Activity
        if (savedInstanceState == null) {
            //Add Fragment
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentOfFragment, new MainFragment())
                    .commit();
        }


    }   // Main Method

}   // Main Class
