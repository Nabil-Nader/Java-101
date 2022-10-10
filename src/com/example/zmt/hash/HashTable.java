package com.example.zmt.hash;

import java.util.ArrayList;

public class HashTable <T>{

    //create an array that will hold element of type ArrayList
    private int size;

    private ArrayList<HashEntity>[] hashEntities;

    public HashTable(int size) {
        this.size = size;

        this.hashEntities = new ArrayList[this.size];
    }

    //method to generate hash function
    private int getHash(String key){
        int hash =0;
        for(int i = 0; i < key.length();i++){
            hash = (hash + key.charAt(i) * i ) % this.hashEntities.length;
        }
        return hash;

    }

    public Integer getHashData(String key){
        int address = getHash(key);
        ArrayList<HashEntity> buckt = this.hashEntities[address];
        System.out.println(buckt.toString());
        if(buckt !=null){
            for(HashEntity hashEntity : buckt){
                if(hashEntity.getKey().equals(key))
                    return hashEntity.getValue();
            }
        }

        return null;
    }

    public void setHashData(String key , int value){

        int address = getHash(key);
        if(hashEntities[address]==null){
            ArrayList<HashEntity> entityArrayList = new ArrayList<>();
            hashEntities[address]=entityArrayList;
            this.size++;
        }

        // we are always gonna override collection
        HashEntity data = new HashEntity(key,value);
        hashEntities[address].add(data);
    }
}
