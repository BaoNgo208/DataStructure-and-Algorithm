import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Setter
@Getter
public class MyBST {
    public TreeNode root;
    public  MyBST() {

    }
    //Cach1:Su dung vong lap
    public TreeNode insert(TreeNode root,int value) {
        TreeNode newNode =new TreeNode(value);
         //TH1 root == null
        if(root == null) {
             root =newNode;
             return root;
        }else {
            TreeNode temp = root;
            while (true) {
                if(value > temp.getVal()) {
                    if(temp.right==null) {
                        temp.right=newNode;
                        break;
                    }else {
                        temp=temp.right;
                    }

                }else{
                    if(temp.left == null) {
                         temp.left=newNode;
                         break;
                    }else {
                        temp=temp.left;
                    }
                }
            }
        }

         return root;
    }

    //Cach2:Su dung de quy
    public TreeNode insertUsingRecursion(TreeNode root,int value){
        if(root == null) {
            return new TreeNode(value);
        }
        if(value < root.val) {
            if(root.left == null) {
                 root.left = new TreeNode(value);
            }else {
                insertUsingRecursion(root.left,value);
            }
        }else {
            if(root.right == null) {
                 root.right = new TreeNode(value);
            }else{
                insertUsingRecursion(root.right,value);
            }
        }
        return root;
    }
}
