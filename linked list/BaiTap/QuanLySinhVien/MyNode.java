public class Node {
    public Student student;
    public Node next;
    public Node(Student student) {
         this.student = student;
    }
    public Node(Student student,Node next) {
         this.student =student;
         this.next = next;
    }
}
