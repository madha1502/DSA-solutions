import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class Main{
    static boolean sorted(Node root,int key){
        Queue<Node>q = new LinkedList<>();
        if(root==null){
            return false;
        }
        q.offer(root);
        while(!q.isEmpty()){
            Node curr = q.poll();
            if(curr.data==key){
                return true;
            }
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        return false;
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        int key = 50;
        System.out.print(sorted(root,key));
    }
}
