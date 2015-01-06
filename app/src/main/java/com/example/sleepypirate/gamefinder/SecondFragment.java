package com.example.sleepypirate.gamefinder;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nic on 1/5/2015.
 */
public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.second_fragment, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.sfTextView);
        textView.setText("Friends List");
        return rootView;
    }
}
