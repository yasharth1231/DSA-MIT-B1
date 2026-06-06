public class LL1 {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;

        }
    }

    static Node addAtHead(Node head,int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;

        }
        
        newNode.next=head;
        head=newNode;
        return head;
    }
    static Node addAtTail(Node head,int val){
            Node newNode= new Node(val);
            if(head == null){
                return newNode;
            }
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
                
            }
            temp.next =newNode;
            return head;   
        }
    static Node addAtPos(Node head,int val,int pos){
        Node newNode=new Node (val);
        if(pos==1){
            return addAtHead(head,val);
        }
        Node temp =head;
        for(int i=1;i<=pos-2;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
        
    }
      static Node deleteAtHead(Node head) {
        if (head == null) {
            return null;
        }
        return head.next;
    }
    static Node deleteAtTail(Node head){
        if(head==null){
            return null;
        }
        Node  temp =head;
        while (temp.next.next!=null){
            temp =temp.next;
        }
        temp.next =null;
        return head;
    }
     static Node deleteAtPos(Node head, int pos) {
        if (head == null) {
            return null;
        }
        if (pos == 1) {
            return deleteAtHead(head);
        }
        Node temp = head;
        for (int i = 1; i <= pos - 2 && temp != null; i++) {
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
    static Node deleteWithData(Node head, int key){
        if (head==null || (head.next == null && head.data !=key)){
            return head;
        }
        if (head.data==key){
            return head.next;
        }
        Node temp =head;
        while (temp.next != null && temp.next.data != key){
            temp =temp.next;

        }
        if (temp.next != null){
            temp.next =temp.next.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    static Node updateAtHead(Node head, int newVal) {
        if (head != null) {
            head.data = newVal;
        }
        return head;
    }
    static Node updateAtTail(Node head, int newVal) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.data = newVal;
        return head;
    }

    // NEW: Update the value at a specific 1-based position
    static Node updateAtPos(Node head, int newVal, int pos) {
        if (head == null) {
            return null;
        }
        Node temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }
        // Only update if the target position index exists in the list
        if (temp != null) {
            temp.data = newVal;
        }
        return head;
    }
    static void printList(Node head){
        if (head==null){
            return;
        }
        Node temp =head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;

        }
        System.out.println("null");
    }
    static Node findMiddle(Node head){
        if(head==null){
            return null;
        }
        Node turtle =head;
        Node rabbit =head;
        while(rabbit.next.next!=null && rabbit.next!=null){
            turtle =turtle.next;
            rabbit =rabbit.next.next;
        }
        return turtle;

    }
    static boolean detectCycle(Node head){
        if(head==null){
            return false;
        }
        Node slow = head;
        Node fast =head;
        while (fast!=null && fast.next!= null){
            slow =slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    static Node reverse(Node head){
        if(head==null) return null;
        Node prev =null;
        Node curr =head;
        Node next;
        while (curr !=null) {
            next = curr.next;
            curr.next =prev;
            prev=curr;
            curr=next;   
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head1 =new Node(10);
        head1.next =new Node(20);
        head1.next.next =new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=head1.next;
        System.out.println(detectCycle(head1));

        // Node head =addAtHead(null,10);
        // head=addAtTail(head, 20);
        // head=addAtTail(head, 30);
        // head=addAtTail(head, 40);
        // head=addAtTail(head, 50);
        // printList(head);
        // head= addAtPos(head, 25, 3);
        // System.out.println();
        // printList(head);

        // head=deleteAtHead(head);
        // printList(head);
        // head=deleteAtPos(head, 2);
        // printList(head);
        // head=deleteAtTail(head);
        // printList(head);  
        // Node middle =findMiddle(head);
        // System.out.println();
        // System.out.println(middle.data);


    }
}
