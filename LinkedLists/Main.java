package DataStructures.LinkedLists;

public class Main {
    public static void main(String[] args){
        LinkedList LinkedList1 = new LinkedList(5);
        // print everything
        LinkedList1.printHead();
        LinkedList1.printTail();
        LinkedList1.printLength();
        LinkedList1.printList();

        System.out.println();
        
        // append
        LinkedList1.append(4);
        LinkedList1.printHead();
        LinkedList1.printTail();
        LinkedList1.printLength();
        LinkedList1.printList();


        // test removeLast() method

        System.out.printf("%nRemoved Node Value is: %d ", LinkedList1.removeLast().value); // 4 is removed

        System.out.printf("%nRemoved Node Value is: %d ", LinkedList1.removeLast().value); // 5 is removed

        System.out.printf("%nRemoved Node Value is: %s ", LinkedList1.removeLast()); // null (LL is empty)


        
    }
    
}
