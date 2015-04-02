package com.rgz.eventbussample;

import android.app.Activity;
import android.os.Bundle;

import com.rgz.eventbussample.events.ShowFragmentEvent;
import com.rgz.eventbussample.events.UpdateActionBarTitleEvent;
import com.rgz.eventbussample.fragments.FirstFragment;

import de.greenrobot.event.EventBus;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction().add(R.id.container, new FirstFragment()).commit();
        }
    }

    public void onEvent(ShowFragmentEvent event) {
        getFragmentManager().beginTransaction().replace(R.id.container,
                event.getFragment()).addToBackStack(null).commit();
    }

    public void onEvent(UpdateActionBarTitleEvent event) {
        getActionBar().setTitle(event.getTitle());
    }

    @Override
    protected void onDestroy() {
        EventBus.getDefault().unregister(this);
        super.onDestroy();
    }

}
