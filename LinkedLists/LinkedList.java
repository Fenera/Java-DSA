package DataStructures.LinkedLists;

public class LinkedList{

    private Node head;
    private Node tail;
    private int length;


    // creates a new node
    class Node {
        int value;
        Node next; // pointer to the next node in the linked list


        public Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);

        head = newNode; // head is pointing to the same Node as newNode
        tail = newNode;
        length = 1; 

    }

    public void append(int value){
        Node newNode = new Node(value);

        if(head == null || tail == null){ // can also say length == 0

            // pointing to the new node
            head = newNode;
            tail = newNode;
        }else{ 
            tail.next = newNode; // tail pointer points to new node
            tail = newNode; // tail shifts to new node and tail.next is now null
        }

        length ++;
    }

    // removes the last node in the LL
    public Node removeLast(){
        // LL is empty(can also test if head or tail = null for same effect)
        if(length == 0) return null;

        Node temp = head;
        Node pre = head; 

        while(temp.next != null){
            pre = temp;
            temp = temp.next; // temp is always one node ahead of pre so it will store the second to last node at the end
        }
        // assign updated tail
        tail = pre;
        tail.next = null; // breaks node off end
        length --;

        // edge case for when LL has only one node
        if(length == 0){
            head = null; 
            tail = null;
        }

        return temp;
    }

    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printHead(){
        System.out.println("Head: " + head.value);
    }

    public void printTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void printLength(){
        System.out.println("Length: " + length);
    }

    // append adds the node to the end of the LL

    // prepend adds the node to the begininning of the LL

    // insert inserts the node the a particular index
}