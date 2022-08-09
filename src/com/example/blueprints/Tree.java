package com.example.blueprints;

import java.awt.*;

public class Tree {

    //create a class blueprint with attributes , behaviours and constructor

    //use the constructor to build instances

    // organize code into static and non-static member
    private double height ;

    private double treeTrunkInchess;

    private TreeType treeType ;

    //every tree should have this color
    static Color TRUNK_COLOR = new Color(102,51,0);

    /*
        Non- Static Member
            A part of a class that is accessible with an instance and
            belongs to that instance .

         static Member
            A part of a Class that is accessible through the class
            and belongs to that class.
            belong to all the instances of that class
     */


    public Tree(double height, double treeTrunkInchess, TreeType treeType) {
        this.height = height;
        this.treeTrunkInchess = treeTrunkInchess;
        this.treeType = treeType;
    }

    public void grow(){
        this.height = this.height + 10;
        this.treeTrunkInchess = this.treeTrunkInchess + 1 ;
    }

    public void announceTallTree() {
        if (this.height > 100) {
            System.out.println("That's a tall " + this.treeType + " tree!");
        }

    }



    /*
        static Class behavior
        only rely on Class Member
     */

    static void announceTree(){
        System.out.println("Look Out for that"+TRUNK_COLOR+" tree!");
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTreeTrunkInchess() {
        return treeTrunkInchess;
    }

    public void setTreeTrunkInchess(double treeTrunkInchess) {
        this.treeTrunkInchess = treeTrunkInchess;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public static Color getTrunkColor() {
        return TRUNK_COLOR;
    }

    public static void setTrunkColor(Color trunkColor) {
        TRUNK_COLOR = trunkColor;
    }
}
