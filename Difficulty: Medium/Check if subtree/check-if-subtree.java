/*complete the given function*/

/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/

class Solution {
    public static boolean isSubtree(Node T, Node S) {
        // add code here.
        if(S==null)return true;
        if(T==null)return false;
        if(isIdentical(T,S))return true;
        return isSubtree(T.left,S) || isSubtree(T.right,S);
    }
    public static boolean isIdentical(Node a,Node b){
        if(a==null && b==null)return true;
        if(a==null || b==null)return false;
        if(a.data==b.data){
            return isIdentical(a.left,b.left) && isIdentical(a.right,b.right);
        }
        return false;
    }
}