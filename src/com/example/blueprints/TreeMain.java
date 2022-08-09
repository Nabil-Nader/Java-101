package com.example.blueprints;

public class TreeMain {
    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,12,TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,10,TreeType.MAPLE);


       myFavoriteMapleTree.announceTallTree();


      myFavoriteOakTree.announceTallTree();

        System.out.println(Tree.TRUNK_COLOR);

        Tree.announceTree();

    }






}
