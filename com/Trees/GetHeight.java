package com.Trees;

public class GetHeight {
    public static int getHeight(TreeNode<Integer> root){
        int ans=0;
        for (TreeNode<Integer> child: root.children) {
            int childHeight=getHeight(child);
            if(childHeight>ans) ans=childHeight;
        }
        return ans+1;
    }
}
