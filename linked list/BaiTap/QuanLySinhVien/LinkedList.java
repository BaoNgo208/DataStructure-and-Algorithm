public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
         this.size = 0 ;
    }


    public Boolean checkMSSV(int mssv) {
        return  false;
    }
    public void insertFirst(Student student) {
        Node newNode =new Node(student);
        newNode.next = head ;
        head = newNode;

        if(tail == null) {
            tail = head;
        }
        size ++;
    }

    public void display(){
        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.student.getName() + "->");
            temp = temp.next;
        }
        System.out.print("end");

    }
}
