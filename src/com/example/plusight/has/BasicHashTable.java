package com.example.plusight.has;

public class BasicHashTable <X,Y>{

    private HashEntity[] data;
    //this will be how big is the hash table is
    private int capacity;

    public BasicHashTable(int capacity) {
        this.capacity = capacity;
        this.data = new HashEntity[this.capacity];
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
