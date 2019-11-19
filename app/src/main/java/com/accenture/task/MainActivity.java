package com.accenture.task;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.accenture.task.fragments.ButtonFragment;
import com.accenture.task.fragments.SelectItemsFragment;

public class MainActivity extends AppCompatActivity implements ButtonFragment.OnButtonClickListner{
    private static final int HORSE = 1;
    private static  String TAG = "com.accenture.task.ButtonFragment";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            ButtonFragment buttonsFragement = new ButtonFragment();
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.frameLayout, buttonsFragement);
            fragmentTransaction.commit();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    public void onclickbutton(int code) {
        Bundle args = new Bundle();
        if (code == HORSE) {
            args.putInt("code", HORSE);
        }
        SelectItemsFragment selectFragment = new SelectItemsFragment();
        selectFragment.setArguments(args);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, selectFragment);
        fragmentTransaction.commit();
    }
}
