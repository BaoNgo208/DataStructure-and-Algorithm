public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertFirst(new Student(1,"Ngo Gia Bao", 3.2F));
        linkedList.insertFirst(new Student(2,"Ngo Gia Huy", 3.2F));
        linkedList.display();
    }
}
