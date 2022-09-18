package com.example.in.linkedlist;

public class CustomeLink {
    Node head;


    public void displayNodeContents(){
        Node current = head;
        while(current !=null){
            System.out.print(current.data + "->");
            current =current.next;
        }
        System.out.println();
    }

    public void deleteBackHalf(){

        if(head == null || head.next == null){
          head = null;
        }

        Node slow = head ;
        Node fast = head;
        Node prev = null;

        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;

        }
        prev.next = null;
    }

    public void deleteNodeByIndex(int index){
        Node prev = null;
        Node newNext = head;
        while (newNext!=null){
            int temp = newNext.data;
            if(temp==index){
                prev.next = newNext.next;
            }else{
                prev = newNext;

            }
            newNext = newNext.next;
        }
    }

    public void deleteKthNodeFromEnd(int k){
        if(head == null || k ==0){
            return;
        }

//        list = [a,b,c,d] k =2
        Node first = head;//a
        Node second = head;//a
        for(int i = 0; i<k; i++){
            second = second.next;
            if(second.next==null){
                // k>- length of list
                if(i== k -1){
                    head = head.next;
                }
                return;
            }
        }

        //secod = c
        while (second.next!=null){
            first = first.next;
            second = second.next;
        }
        //first = b
        // second = d

        //first.next is the node we want to get rid of it

        first.next = first.next.next;
    }
}
