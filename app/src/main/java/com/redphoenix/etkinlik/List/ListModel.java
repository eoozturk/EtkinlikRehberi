package com.redphoenix.etkinlik.List;

import java.util.ArrayList;

public class ListModel {


    private int id;
    private String title;
    private String message;
    private String image;



    public ListModel(int id, String title, String message, String image) {
        this.id=id;
        this.title = title;
        this.message = message;
        this.image=image;
    }

    public ListModel() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
