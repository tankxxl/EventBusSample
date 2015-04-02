package com.rgz.eventbussample.events;

import android.app.Fragment;

/**
 * Created by rgz on 15/2/3.
 */
public class ShowFragmentEvent {

    private Fragment fragment;

    public ShowFragmentEvent(Fragment fragment) {
        this.fragment = fragment;
    }

    public Fragment getFragment() {
        return this.fragment;
    }

}
