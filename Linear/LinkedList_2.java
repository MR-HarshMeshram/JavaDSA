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
    public static void AddFist(String data){
        Node new_node=new Node(data);
        if( head==null){
            head=new_node;
            return;
        }
        new_node.next=head;
        head=new_node;
    }
    public static void AddLast(String data){
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
    public static void PrintList(){
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
     public static void DeleteFirst(){
        if(head==null){
            System.out.println(" the list is empty ");
            return;
        }
        head=head.next;
    }
    public static void DeleteLast(){
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
    public static void main(String[] args){
        LinkedList_2 LL=new LinkedList_2();
        LL.AddFist("FIRST");
        LL.AddFist("Second");
        LL.PrintList();
        LL.AddLast(" third ");
        LL.PrintList();

        LL.DeleteFirst();
        LL.PrintList();
        LL.DeleteLast();
        LL.PrintList();
    }
}