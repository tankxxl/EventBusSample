package com.rgz.eventbussample.events;

/**
 * Created by rgz on 15/2/3.
 */
public class UpdateActionBarTitleEvent {

    private String title;

    public UpdateActionBarTitleEvent(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
