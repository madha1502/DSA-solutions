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
    static List<List<Integer>> sorted(Node root,List<List<Integer>>ans){
        //List<List<Integer>ans = new ArrayList<>();
        Queue<Node>q = new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer>ll = new ArrayList<>();
            int s = q.size();
            for(int i=0;i<s;i++){
                Node curr = q.poll();
                ll.add(curr.data);
                
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            ans.add(ll);
        }
        return ans;
    }
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        List<List<Integer>>ans = new ArrayList<>();
        System.out.print(sorted(root,ans));
    }
}
