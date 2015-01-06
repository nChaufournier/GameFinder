package com.example.sleepypirate.gamefinder;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nic on 1/5/2015.
 */
public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_fragment, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.ffTextView);
        textView.setText("Find Local Games");
        return rootView;
    }
}
