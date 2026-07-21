class Linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;

    void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    void printlist(){
        Node temp=head;
        while(temp!=null){
           System.out.print(temp.data+"-->"); 
           temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Linkedlist list=new Linkedlist();
        list.addfirst(10);
        list.addfirst(30);
        list.addfirst(50);
        list.printlist();
        list.addlast(70);
        list.printlist();

    }
}