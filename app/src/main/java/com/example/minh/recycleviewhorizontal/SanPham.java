package com.example.minh.recycleviewhorizontal;

/**
 * Created by Minh on 3/26/2018.
 */

public class SanPham {
    private String name;
    private String urlanh;

    public SanPham(String name, String anh) {
        this.name = name;
        this.urlanh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnh() {
        return urlanh;
    }

    public void setAnh(String anh) {
        this.urlanh = anh;
    }
}
