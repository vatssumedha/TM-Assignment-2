package com.tmassignment2.events;

import com.tmassignment2.model.InformationList;

/**
 * Created by Sumedha Vats on 26-03-2019.
 */
public class CompatibleQuesEvent {
    public InformationList getInformationList() {
        return informationList;
    }

    public void setInformationList(InformationList informationList) {
        this.informationList = informationList;
    }

    InformationList informationList;

    public CompatibleQuesEvent(InformationList informationList) {
        this.informationList = informationList;
    }
}
