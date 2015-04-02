package com.rgz.eventbussample.events;

/**
 * Created by rgz on 15/2/4.
 */
public class UpdateTextEvent {

    private  String newText;

    public UpdateTextEvent(String newText) {
        this.newText = newText;
    }

    public String getNewText() {
        return newText;
    }
}
