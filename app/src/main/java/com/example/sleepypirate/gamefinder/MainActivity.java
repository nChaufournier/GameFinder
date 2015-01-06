package com.example.sleepypirate.gamefinder;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;

import org.w3c.dom.Text;


public class MainActivity extends Activity implements ActionBar.TabListener {
    Button btnClickHere;
    TextView tvName;
    private ViewPager viewPager;
    private TabsAdapter tabsAdapter;
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        //Links App to DataBase!!!
        Resources res = getResources();
        String PARSE_APP_ID = res.getString(R.string.parse_app_id);
        String PARSE_CLIENT_KEY = res.getString(R.string.parse_client_key);
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, PARSE_APP_ID, PARSE_CLIENT_KEY);
        //End of Database Link
        PushService.setDefaultPushCallback(this, MainActivity.class,
                R.drawable.ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();

        viewPager = (ViewPager) findViewById(R.id.pager);
        actionBar = getActionBar();
        //tabsAdapter = new TabsAdapter(getFragmentManager());

        viewPager.setAdapter(tabsAdapter);
        actionBar.setHomeButtonEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        for(String tabName : TabsAdapter.getTabNames()){
            ActionBar.Tab aTab = actionBar.newTab().setText(tabName).setTabListener(this);
            actionBar.addTab(aTab);
        }

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                actionBar.setSelectedNavigationItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        btnClickHere = (Button) findViewById(R.id.btnClickHere);
        tvName = (TextView) findViewById(R.id.nameBox);




    }

    public static void updateParseInstallation(ParseUser user){
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        //installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
