import java.util.*;
class LinkedList_2{
    Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // add first
    public  void AddFist(String data){
        Node new_node=new Node(data);
        if( head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public  void AddLast(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }
        
        Node current_node=head;
        while (current_node.next!=null){
            current_node=current_node.next;
            
        }
        current_node.next=new_node;
    }
    public  void PrintList(){
        Node current_node=head;
        if(head==null){
            System.out.println(" linkedlist is empty ");
            return;
        }
        while(current_node!=null){
            System.out.print(current_node.data+" -> ");
            current_node=current_node.next;
        }
        System.out.println(" null ");
    }
     public  void DeleteFirst(){
        if(head==null){
            System.out.println(" the list is empty ");
            return;
        }
        head=head.next;
    }
    public  void DeleteLast(){
        if(head==null){
            System.out.println(" the List is empty ");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node current_node=head;
        while(current_node.next.next!=null){
            current_node=current_node.next;
        }
        current_node.next=null;
        
    }
        public void Revers_LinkedList() {
        if (head == null || head.next == null) {
            return;  
        }

        Node prev_node = null;
        Node current_node = head;

        while (current_node != null) {
            Node next_node = current_node.next;  
            current_node.next = prev_node;  

            
            prev_node = current_node;
            current_node = next_node;
        }
        head = prev_node;  
    }
    public static void main(String[] args){
        LinkedList_2 LL=new LinkedList_2();
        LL.AddFist("FIRST");
        LL.AddFist("Second");
        LL.AddFist(" third ");
        LL.PrintList();

        LL.Revers_LinkedList();
        LL.PrintList();
    }
}