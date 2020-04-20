public class Doubleendedqueueusinglinkedlist {
    Node2 front;
    Node2 rear;
    Doubleendedqueueusinglinkedlist(){
        front=null;
        rear=null;
    }
    public boolean isEmpty(){
        return front ==null;
    }
    public void enqueueRear(Node2 newnode){
        if(isEmpty()){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void enqueueFront(Node2 newnode){
        if(isEmpty()){
            front = rear = newnode;
        }
        else{
            newnode.next = front;
            front = newnode;
        }
    }
    public void dequeueFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("value removed : "+front.data);
            front = front.next;
        }
    }
    public void dequeueRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            System.out.println("value removed : "+rear.data);
            Node2 temp = front;
            while(temp.next.next!=null) {
                temp = temp.next;
            }
            temp.next = null;
            rear = temp;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node2 temp = front;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Doubleendedqueueusinglinkedlist obj = new Doubleendedqueueusinglinkedlist();
        Node2 n1 = new Node2(10);
        Node2 n2 = new Node2(20);
        Node2 n3 = new Node2(30);
        Node2 n4 = new Node2(40);
        Node2 n5 = new Node2(50);
        Node2 n6 = new Node2(60);
        Node2 n7 = new Node2(70);
        Node2 n8 = new Node2(80);
        Node2 n9 = new Node2(90);
        obj.enqueueFront(n1);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.enqueueFront(n2);
        obj.display();
        obj.enqueueFront(n3);
        obj.enqueueRear(n4);
        obj.enqueueRear(n5);
        obj.display();
        obj.dequeueFront();
        obj.dequeueFront();
        obj.display();
        obj.enqueueRear(n6);
        obj.enqueueRear(n7);
        obj.display();
        obj.enqueueFront(n8);
        obj.enqueueFront(n9);
        obj.display();
        obj.dequeueFront();
        obj.display();
        obj.dequeueRear();
        obj.display();
        obj.dequeueRear();
        obj.display();
    }
}
