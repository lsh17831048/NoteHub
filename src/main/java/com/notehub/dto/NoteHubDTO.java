package com.notehub.dto;

/*
create table notehub(
    note_num NUMBER primary key ,
    note_title varchar2(100),
    note_content varchar2(255),
    note_register_datetime date default sysdate,
    note_recommend number,
    note_readCount number
);
 */

import java.util.Date;

public class NoteHubDTO {
    int note_num;
    String note_title;
    String note_content;
    Date note_register_date;
    int note_recommend;
    int note_readCount;

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

    public Date getNote_register_date() {
        return note_register_date;
    }

    public void setNote_register_date(Date note_register_date) {
        this.note_register_date = note_register_date;
    }

    public int getNote_recommend() {
        return note_recommend;
    }

    public void setNote_recommend(int note_recommend) {
        this.note_recommend = note_recommend;
    }

    public int getNote_readCount() {
        return note_readCount;
    }

    public void setNote_readCount(int note_readCount) {
        this.note_readCount = note_readCount;
    }
}
