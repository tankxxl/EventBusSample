package com.rgz.eventbussample.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rgz.eventbussample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        ButterKnife.inject(this, view);
//        EventBus.getDefault().post(new UpdateActionBarTitleEvent(getString(R.string.first_fragment)));

        return view;
    }

    @OnClick(R.id.first_button)
    public void firstButtonClick() {
//        EventBus.getDefault().post(new ShowFragmentEvent(new SecondFragment()));
    }

}
