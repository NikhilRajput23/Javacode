import java.util.*;
class nikhil {
    int data;
    nikhil left;
    nikhil right;

    nikhil(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}   
public class BST {

    public static nikhil insert(nikhil root, int val) {
        if (root == null) {
            root = new nikhil(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(nikhil root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(nikhil root,int key){
        if(root == null){
            return false;
        }
        if(root.data>key){
            return search(root.left,key);
        }else if(root.data==key){
            return true;
        }else{
            return search(root.right,key);
        }
    }

    public static void main(String[] args) {
              Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int []values=new int[n];
       for(int i=0;i<values.length;i++){
        values[i]=sc.nextInt();
       }
       int key =sc.nextInt();
               nikhil root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        inorder(root);
        System.out.println();
        if(search(root , key)){
        System.out.println("found");
        }else{
                    System.out.println("not found");

        }
    }
}
