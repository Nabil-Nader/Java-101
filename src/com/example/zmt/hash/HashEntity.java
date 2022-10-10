package com.example.zmt.hash;

public class HashEntity {

    private String key;
    private int value;

    public HashEntity(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public HashEntity() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashEntity{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
