package com.accenture.task.fragments;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.accenture.task.R;
import com.accenture.task.model.Item;

import java.util.ArrayList;

public class ButtonFragment extends Fragment{

    public interface OnButtonClickListner {
        void onclickbutton(int code);
    }

    OnButtonClickListner listner;
        private static final int HORSE=1;
        private static String TAG = "com.accenture.task.ButtonFragment";
    private ArrayList<Item> selectedItemsList;

    /*Get called as and when Activity commits Fragment Transaction to this specific ButtonFragment*/
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // Get a reference to the parent Activity.
        Log.d(TAG, "onAttach");
        if (context instanceof OnButtonClickListner){
            this.listner = (OnButtonClickListner) context;
        }

    }

    // Called to do the initial creation of the Fragment.
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    // Called once the Fragment has been created in order for it to
    // create its user interface.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.buttons_fragments, container, false);
    }


    @Override
    public void onViewCreated( View view, Bundle savedInstanceState) {
        Log.d(TAG, "onViewCreated");
        Button button = (Button) view.findViewById(R.id.horseButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listner.onclickbutton(HORSE);
            }
        });
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActivityCreated");
    }

    // Called at the start of the visible lifetime.
    @Override
    public void onStart()
    {
        super.onStart();
        // Apply any required UI change now that the Fragment is visible.
        Log.d(TAG, "onStart");
    }

    // Called at the start of the active lifetime.
    @Override
    public void onResume() {
        super.onResume();
        // Resume any paused UI updates, threads, or processes required
        // by the Fragment but suspended when it became inactive.
        Log.d(TAG, "onResume");
    }

    // Called at the end of the active lifetime.
    @Override
    public void onPause() {
        // Suspend UI updates, threads, or CPU intensive processes
        // that don't need to be updated when the Activity isn't
        // the active foreground activity.
        // Persist all edits or state changes
        // as after this call the process is likely to be killed.
        super.onPause();
        Log.d(TAG, "onPause");
    }

    // Called to save UI state changes at the
    // end of the active lifecycle.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate, onCreateView, and
        // onCreateView if the parent Activity is killed and restarted.
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState");
    }

    // Called at the end of the visible lifetime.
    @Override
    public void onStop() {
        // Suspend remaining UI updates, threads, or processing
        // that aren't required when the Fragment isn't visible.
        super.onStop();
        Log.d(TAG, "onStop");
    }

    // Called when the Fragment's View has been detached.
    @Override
    public void onDestroyView() {
        // Clean up resources related to the View.
        super.onDestroyView();
        Log.d(TAG, "onDestroyView");
    }

    // Called at the end of the full lifetime.
    @Override
    public void onDestroy() {
        // Clean up any resources including ending threads,
        // closing database connections etc.
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    // Called when the Fragment has been detached from its parent Activity.
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onDetach");
    }
}
