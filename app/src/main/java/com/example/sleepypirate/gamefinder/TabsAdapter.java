package com.example.sleepypirate.gamefinder;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Nic on 1/5/2015.
 */
public class TabsAdapter extends FragmentPagerAdapter {

    public static String[] tabNames = {"Local Games", "Friends"};

    public TabsAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }
/*
    public TabsAdapter(FragmentManager fm){
    super(fm);
    }
    */

    /*@Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();

        }
        return null;
    }*/

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return tabNames.length;
    }
    public static String[] getTabNames(){
        return tabNames;
    }

    public static void setTabNames(String[] tabNames){TabsAdapter.tabNames = tabNames;}
}
