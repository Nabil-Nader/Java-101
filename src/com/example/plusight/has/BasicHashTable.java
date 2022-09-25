package com.example.plusight.has;

public class BasicHashTable <X,Y>{

    private HashEntity[] data;
    //this will be how big is the hash table is
    private int capacity;

    private int size;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        this.data = new HashEntity[this.capacity];
        this.size = 0;
    }

    // create get size method

    public int size(){
        return this.size;
    }
    // create get/put method

    public Y get(X key){

        int hash = calculateHas(key);
        // if we don't have anything for the given key, just return null
        if(data[hash] == null){
            return null;
        }
        //otherwise, get has the hasEntry for the key and retrurn its value
        else {
            return (Y)data[hash].getValue();
        }
    }
    // before create get method we will create a private method

    private int calculateHas(X key){
        int hash = (key.hashCode() % this.capacity);
        // this is necessary to deal with collisions.

        while (data[hash] !=null && !data[hash].getKey().equals(key)){
            hash = (hash + 1) % this.capacity;
        }
        return hash;
    }



    public class HashEntity<X,Y>{
        private X key;
        private Y value;

        public HashEntity(X key, Y value) {
            this.key = key;
            this.value = value;
        }

        public X getKey() {
            return key;
        }

        public void setKey(X key) {
            this.key = key;
        }

        public Y getValue() {
            return value;
        }

        public void setValue(Y value) {
            this.value = value;
        }
    }
}
