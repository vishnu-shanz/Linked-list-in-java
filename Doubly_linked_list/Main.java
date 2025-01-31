package Doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        DLL l=new DLL();
        l.insertAtend(100);
        l.insertAtend(200);
        l.insertAtend(600);
        l.insertAtBegin(0);
        l.insertAtSpec(1,500);
        //l.insertAtBegin(4);
        l.display();
//        l.deleteAtBegin();
//        l.deleteAtEnd();
//        l.display();
    }
}
