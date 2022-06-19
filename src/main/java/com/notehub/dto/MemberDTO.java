package com.notehub.dto;

import java.util.Date;

public class MemberDTO {
    public MemberDTO() {
    }

    private int mem_num;
    private String mem_id;
    private String mem_password;
    private String mem_username;
    private String mem_phone;
    private String mem_address;
    private String mem_email;
    private Date mem_register_datetime;
    private String mem_is_admin;

    public int getMem_num() {
        return mem_num;
    }

    public void setMem_num(int mem_num) {
        this.mem_num = mem_num;
    }

    public String getMem_id() {
        return mem_id;
    }

    public void setMem_id(String mem_id) {
        this.mem_id = mem_id;
    }

    public String getMem_password() {
        return mem_password;
    }

    public void setMem_password(String mem_password) {
        this.mem_password = mem_password;
    }

    public String getMem_username() {
        return mem_username;
    }

    public void setMem_username(String mem_username) {
        this.mem_username = mem_username;
    }

    public String getMem_phone() {
        return mem_phone;
    }

    public void setMem_phone(String mem_phone) {
        this.mem_phone = mem_phone;
    }

    public String getMem_address() {
        return mem_address;
    }

    public void setMem_address(String mem_address) {
        this.mem_address = mem_address;
    }

    public String getMem_email() {
        return mem_email;
    }

    public void setMem_email(String mem_email) {
        this.mem_email = mem_email;
    }

    public Date getMem_register_datetime() {
        return mem_register_datetime;
    }

    public void setMem_register_datetime(Date mem_register_datetime) {
        this.mem_register_datetime = mem_register_datetime;
    }

    public String getMem_is_admin() {
        return mem_is_admin;
    }

    public void setMem_is_admin(String mem_is_admin) {
        this.mem_is_admin = mem_is_admin;
    }
}

