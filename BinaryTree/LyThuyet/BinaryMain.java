package BinaryTree.LyThuyet;
public class BinaryMain {
    public static void main(String[] args) {
       MyBST myBST = new MyBST();

        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),5));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),1));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),6));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),0));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),3));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),7));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),2));
        myBST.setRoot(myBST.insertUsingRecursion(myBST.getRoot(),4));
////asdsad
       System.out.println("done");
    }
}
