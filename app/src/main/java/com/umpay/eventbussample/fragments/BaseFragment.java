package com.umpay.eventbussample.fragments;


import android.app.Fragment;

import de.greenrobot.event.EventBus;

/**
 * A simple {@link Fragment} subclass.
 */
public class BaseFragment extends Fragment {

    protected boolean isStickyAvailable() {
        return  false;
    }

    @Override
    public void onResume() {
        if (isStickyAvailable()) {
            EventBus.getDefault().registerSticky(this);
        } else {
            EventBus.getDefault().register(this);
        }
        super.onResume();
    }

    @Override
    public void onPause() {
        EventBus.getDefault().unregister(this);
        super.onPause();
    }

}
