package Doubly_linked_list;

public class DLL {
    Node head,tail;
    public void insertAtBegin(int data){
        Node n=new Node(data);
        if(head==null){
            head=tail=n;
        }
        if(head!=null){
           n.next=head;
           head.prev=n;
           head=n;
        }
    }
public void insertAtend(int data){
        Node n=new Node(data);
        if (tail==null){
            head=tail=n;
        }
        if(tail!=null){
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
}
public void insertAtSpec(int pos,int data) {
    Node n = new Node(data);
    Node temp = head;
    if (temp == null) {
        head = tail = n;
    }
    if (head == tail) {
        head.next = n;
        n.prev = head;
        n.next = null;
    }
    for (int i = 0; i < pos-1; i++) {
        temp = temp.next;
    }
    n.next = temp.next;
    temp.next.prev = n;
    temp.next = n;
    temp = n;
}
public void deleteAtBegin(){
        if(head==null){
            System.out.println("List is empty");
        }
        if(head==tail){
            head=tail=null;
        }
        else {
            head = head.next;
            head.prev = null;
        }
}
public void deleteAtEnd(){
        if(head==tail){
            head=tail=null;
        }
        tail=tail.prev;
        tail.next=null;

}
public void display(){
       Node temp=head;
       if(temp==null){
           System.out.println("List is empty");
       }
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("<->");
            }
            temp=temp.next;
        }
    System.out.println();
}
//public void rev(){
//        Node temp=head;
//        while(temp.next==null){
//        }
//}
}
