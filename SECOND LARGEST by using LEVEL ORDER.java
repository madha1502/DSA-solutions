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
    static int secondLar(Node root){
        if(root==null){
            return -1;
        }
        Queue<Node>q = new LinkedList<>();
        q.offer(root);
        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Node curr = q.poll();
            int temp = curr.data;
            if(curr.data>lar){
                sec = lar;
                lar = curr.data;
            }
            else if(curr.data>sec && curr.data!=lar){
                sec=curr.data;
            }
            
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
        return sec;
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        System.out.print(secondLar(root));
    }
}
