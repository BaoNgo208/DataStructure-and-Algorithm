public class LinkedList {
    private  Node head ;
    private  Node tail;
    private  int size;

    public LinkedList() {
         this.size = 0 ;
    }
    public void insertFirst(int value) {
         Node newNode = new Node(value);
         newNode.next = head;
         head = newNode;

         if(tail == null) {
              tail = head;
         }
         size ++;
    }
    public void insertLast(int value) {
         Node newNode = new Node(value);
         if(tail ==null) {
              insertFirst(value);
         }
         else {
              tail.next = newNode;
              tail=newNode;
              size++;
         }

    }

    public void insertAt(int value,int pos) {
        if(pos == 0) {
            insertFirst(value);
        }
        else if(pos  == size  ) {
             insertLast(value);
        }
        else {
            Node temp = head;

            for(int i =1 ; i<pos;i++) {
                temp =temp.next;
            }
            Node node = new Node(value,temp.next);
            temp.next = node;
            size ++ ;
        }
    }

    public void deleteFirst() {
        Node temp = head;
        head = temp.next;
        temp.next = null;
        if(tail == null) {
            System.out.println("list is empty");
        }
        size -- ;
    }
    public void deleteLast() {
        Node temp = head;
        if(tail == null) {
            System.out.println("list is empty");
        }
        for(int i = 1 ; i<size-1;i++) {
            temp= temp.next;
        }
        temp.next = null;
        tail = temp;
        size -- ;

    }
    public void deleteAt(int pos) {
        Node temp =head;
        Node right;
        if(pos == 0 ){
             deleteFirst();
        }
        else if(pos == size - 1) {
             deleteLast();
        }
        else {
            for(int i =1;i<pos ;i++) {
                 temp =temp.next;
            }
            right =temp.next;
            temp.next=right.next;
            right.next= null;
            size--;
        }
    }

    public void display(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");

    }
}
