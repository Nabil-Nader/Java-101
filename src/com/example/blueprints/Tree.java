package com.example.blueprints;

public class Tree {

    public double height ;

    public double treeTrunkInchess;

    public TreeType treeType ;



    public Tree(double height, double treeTrunkInchess, TreeType treeType) {
        this.height = height;
        this.treeTrunkInchess = treeTrunkInchess;
        this.treeType = treeType;
    }

    public void grow(){
        this.height = this.height + 10;
        this.treeTrunkInchess = this.treeTrunkInchess + 1 ;
    }

    public void annonceTallTree() {
        if (this.height > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }

    }
}
