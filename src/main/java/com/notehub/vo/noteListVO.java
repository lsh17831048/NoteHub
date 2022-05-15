package com.notehub.vo;

public class noteListVO {
    public int note_num;
    public String note_title;
    public String note_content;
    public String note_register_datetime;
    public int note_recommend;

    public int getNote_num() {
        return note_num;
    }

    public void setNote_num(int note_num) {
        this.note_num = note_num;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
    }

    public String getNote_content() {
        return note_content;
    }

    public void setNote_content(String note_content) {
        this.note_content = note_content;
    }

    public String getNote_register_datetime() {
        return note_register_datetime;
    }

    public void setNote_register_datetime(String note_register_datetime) {
        this.note_register_datetime = note_register_datetime;
    }

    public int getNote_recommend() {
        return note_recommend;
    }

    public void setNote_recommend(int note_recommend) {
        this.note_recommend = note_recommend;
    }
}
