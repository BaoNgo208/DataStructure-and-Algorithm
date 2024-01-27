
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(0);
        list.insertLast(1);
        list.insertAt(3,1);
        list.insertAt(4,2);
//        list.deleteFirst();
//        list.deleteLast();
            list.deleteAt(2);
        list.display();
    }
}