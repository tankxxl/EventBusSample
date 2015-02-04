package com.umpay.eventbussample.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.umpay.eventbussample.R;
import com.umpay.eventbussample.events.ShowFragmentEvent;
import com.umpay.eventbussample.events.UpdateActionBarTitleEvent;

import butterknife.ButterKnife;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        EventBus.getDefault().post(new UpdateActionBarTitleEvent(getString(R.string.first_fragment)));
        ButterKnife.inject(this, view);

        return view;
    }

    @OnClick(R.id.first_button)
    public void firstButtonClick() {
        EventBus.getDefault().post(new ShowFragmentEvent(new SecondFragment()));
    }


}
