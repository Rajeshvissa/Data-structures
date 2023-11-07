class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class Linkedlist1 {
    Node head=null;
    Node p;

    void insertion(int data){
        Node obj1=new Node(data);
        if(head==null){
            head=obj1;
            p=head;
        }
        else{
            p.next=obj1;
            p=obj1;
        }

    }

    void display(){
        p=head;

        while(p.next!=null){
            System.out.print(p.data+" -->");
            p=p.next;
            
        }


    }

    public static void main(String args[]){
        Linkedlist1 obj1=new Linkedlist1();
        obj1.insertion(3);
        obj1.insertion(4);
        obj1.insertion(5);
        obj1.insertion(6);
        obj1.insertion(6);
        obj1.insertion(9);
        obj1.insertion(10);
        obj1.display();
    }

    }


