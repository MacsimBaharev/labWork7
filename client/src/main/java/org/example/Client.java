package org.example;

import java.util.ArrayList;

public class Client {
    private int uid;
    private String name;
    private int age;
    private boolean sex; //true - men, false - women
    private ArrayList<Phone> phones = new ArrayList<>();

    public Client(int uid, String name, int age, boolean sex, ArrayList<Phone> phones) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phones.addAll(phones);
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public Phone getPhones(int i) {
        return phones.get(i);
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + (sex ? " Men " : " Women ") + phones.toString();
    }
}
