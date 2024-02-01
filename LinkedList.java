class LinkedList{
    public class Node{
        int data ;
        Node next ;
    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
    }
    public static Node head;
    public static Node tail;

    // ADD FIRST
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode ;
            return;
        }
        newNode.next = head ;
        head = newNode;
    }
    // ADD MIDDEL
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    // add MIDDEL
    public void addMiddel(int idx , int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0 ;
        while(i< idx-1){
            temp = temp.next ;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    // print statement
public void print(){
    if(head == null){
        System.out.println("Linked list is empty");
        return;
    }
    Node temp = head ;
    while(temp != null){
        System.out.print(temp.data + ">>");
        temp = temp.next ;
    }
    System.out.println();
}    
    public static void main(String args[]){
        LinkedList ll = new LinkedList(); // object
        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(3);
        // ll.print();
        // ll.addFirst(4);
        // ll.print();
        // ll.addLast(23);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        ll.addFirst(23);
        ll.addMiddel(02, 23);
        ll.print();
    }
}