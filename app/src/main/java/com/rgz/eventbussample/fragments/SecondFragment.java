package com.rgz.eventbussample.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rgz.eventbussample.R;
import com.rgz.eventbussample.events.UpdateTextEvent;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

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

        ButterKnife.inject(this, view);
//        EventBus.getDefault().post(new UpdateActionBarTitleEvent(getString(R.string.second_fragment)));
        return view;
    }

    public void onEvent(UpdateTextEvent event) {
        textView.setText(event.getNewText());
    }

    @OnClick(R.id.second_button)
    public void secondButtonClick() {
//        EventBus.getDefault().post(new UpdateTextEvent(getString(R.string.text_updated)));
    }


}
