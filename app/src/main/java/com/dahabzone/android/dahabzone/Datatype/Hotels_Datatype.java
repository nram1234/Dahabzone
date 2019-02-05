package com.dahabzone.android.dahabzone.Datatype;

public class Hotels_Datatype {
    String name;
    String description;
    String phone;
    String addres;
    int image;

    public Hotels_Datatype(String name, String description, String phone, String addres, int image) {
        this.name = name;
        this.description = description;
        this.phone = phone;
        this.addres = addres;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddres() {
        return addres;
    }

    public int getImage() {
        return image;
    }
}
