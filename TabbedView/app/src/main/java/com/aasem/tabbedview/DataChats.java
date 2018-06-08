package com.aasem.tabbedview;

/**
 * Created by inspire_info_soft on 6/7/2018.
 */

public class DataChats {
    String name,messgae,time;
    int image;

    public DataChats(String name, String messgae, String time, int image) {
        this.name = name;
        this.messgae = messgae;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
