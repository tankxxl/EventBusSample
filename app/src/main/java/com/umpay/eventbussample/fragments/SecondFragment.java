package com.umpay.eventbussample.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.umpay.eventbussample.R;
import com.umpay.eventbussample.events.UpdateActionBarTitleEvent;
import com.umpay.eventbussample.events.UpdateTextEvent;

import butterknife.ButterKnife;
import butterknife.InjectView;
import de.greenrobot.event.EventBus;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends BaseFragment {

    @InjectView(R.id.textViewSecondFragment)
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        EventBus.getDefault().post(new UpdateActionBarTitleEvent(getString(R.string.second_fragment)));
        ButterKnife.inject(this, view);
        return view;
    }

    public void onEvent(UpdateTextEvent event) {
        textView.setText(event.getNewText());
    }

    public void secondButtonClick() {
        EventBus.getDefault().post(new UpdateTextEvent(getString(R.string.text_updated)));
    }


}
