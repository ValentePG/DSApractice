package dev.valente.dsa.linked_list;

public class LinkedList {

    private Node head;

    private static class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void showList(){

       Node temp = head;
       while(temp != null){
           System.out.print(temp.data + " -> ");
           temp = temp.next;
       }
        System.out.println("null");
    }

    public void addInFrontOfList(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;


    }

    public void addInTheBackOfList(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;

        while(temp.next != null){

            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void addInTheGivenIndex(int data, int pos){

        Node newnode = new Node(data);
        if(pos == 0) return;
        if(pos == 1){
            newnode.next = head;
            head = newnode;
        } else {

            Node previous = head;
            int count = 1;
            while(count < pos - 1){
                if(previous.next == null){
                    return;
                }
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newnode.next = current;
            previous.next = newnode;
        }



    }



    public int length(){
        if(head == null){
            return 0;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int indexSearch(int index){

        Node temp = head;
        for(int i = 0; i < index; i++){
            if(temp == null){
                break;
            }
            if(index == i+1){
                return temp.data;
            }
            temp = temp.next;
        }

        return -1;

    }


    public int searchGiveNumber(int data){


        Node temp = head;
        int count = 1;
        while(temp != null){

            if(temp.data == data){
                return count;
            }

            temp = temp.next;
            count++;
        }

        return -1;

    }

    public void remove(int index){

        Node temp = head;
        Node previous = null;
        for(int i = 0; i < index; i++){
            if(temp == null){
                break;
            }

            if(index == i+1){
                if(head == temp){
                    head = temp.next;
                } else {
                    previous.next = temp.next;
                }

            }
            previous = temp;
            temp = temp.next;

        }

    }

//    public void reverse(LinkedList sll){
//
//
//        Node temp = head;
//        Node previous = null;
//        Node first = null;
//        Node last = null;
//        while(temp != null){
//
//            if(temp.next == null){
//                last = temp;
//
//            }
////            last.next = temp.next;
////            temp.next = null;
////            previous.next = temp;
////            temp = last;
//            previous = temp;
//            temp = temp.next;
//
//        }
//    }



    //  REVERSE ENTRE OUTROS

    public static void main(String[] args) {
        var sll = new LinkedList();


        sll.addInTheBackOfList(5);
        sll.addInTheBackOfList(15);
        sll.addInTheBackOfList(2);

        sll.addInTheGivenIndex(16, sll.length() + 1);

//        sll.reverse(sll);

        sll.showList();
    }
}
