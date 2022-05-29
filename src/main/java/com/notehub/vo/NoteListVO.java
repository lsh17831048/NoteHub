package com.notehub.vo;

public class NoteListVO {
    public int notelist_num;
    public String note_title;
    public String mem_id;
    public String note_tag;
    public String note_register_datetime;
    public int note_recommend;
    public int note_readCount;

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getNote_tag() {
        return note_tag;
    }

    public void setNote_tag(String note_tag) {
        this.note_tag = note_tag;
    }

    public int getNote_readCount() {
        return note_readCount;
    }

    public void setNote_readCount(int note_readCount) {
        this.note_readCount = note_readCount;
    }

    public int getNotelist_num() {
        return notelist_num;
    }

    public void setNotelist_num(int notelist_num) {
        this.notelist_num = notelist_num;
    }

    public String getNote_title() {
        return note_title;
    }

    public void setNote_title(String note_title) {
        this.note_title = note_title;
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
