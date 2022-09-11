package com.example.linkedlist;

public class Algorithms {

    public static void main(String[] args) {
        CustomeLink link = new CustomeLink();

        Node firstNode = new Node(3);
        Node secandNode = new Node(4);
        Node thirdNode = new Node(5);
        Node fourthNode = new Node(6);

        link.head = firstNode;
        firstNode.next = secandNode;
        secandNode.next = thirdNode;
        thirdNode.next = fourthNode;

//        link.displayNodeContents();
//        link.deleteBackHalf();
//        link.deleteNodeByIndex(5);
        link.deleteKthNodeFromEnd(2);
        link.displayNodeContents();

        // challenge create an algorithm that deletes the Kth node from the list

        //
    }
}
