package com.example.demo.entity;

public class Name {
    private String name;
    private String tuoi;
    private String className;

    public Name(String name, String tuoi, String className) {
        this.name = name;
        this.tuoi = tuoi;
        this.className ="java5";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Name() {
    }
}
