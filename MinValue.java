// Finding the left most element. No bother whether it is leaf or half leafed.

class Solution {
    // Function to find the minimum element in the given BST.
    int minValue(Node root) {
        // code here
        if(root==null){
            return -1;
        }
        if(root.left==null){
            return root.data;
        }
        return minValue(root.left);
        
    }
}
