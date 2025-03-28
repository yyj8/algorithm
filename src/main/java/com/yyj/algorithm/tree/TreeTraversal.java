package com.yyj.algorithm.tree;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode treeNode = buildTreeNode();
        //前序遍历
        StringBuilder preodersb = new StringBuilder();
        preorderTraversal(treeNode, preodersb);
        System.out.println(preodersb.toString());

        //中序遍历
        StringBuilder inodersb = new StringBuilder();
        inorderTraversal(treeNode, inodersb);
        System.out.println(inodersb.toString());

        //后序遍历
        StringBuilder postodersb = new StringBuilder();
        postorderTraversal(treeNode, postodersb);
        System.out.println(postodersb.toString());

    }

    public static TreeNode buildTreeNode() {
        /**
         *              10
         *         5       15
         *      4    6   12   17
         */
        TreeNode root = new TreeNode(10);
        TreeNode level2left = new TreeNode(5);
        TreeNode level2right = new TreeNode(15);
        root.setLeft(level2left);
        root.setRight(level2right);

        TreeNode level3left1 = new TreeNode(4);
        TreeNode level3right1 = new TreeNode(6);
        level2left.setLeft(level3left1);
        level2left.setRight(level3right1);

        TreeNode level3left2 = new TreeNode(12);
        TreeNode level3right2 = new TreeNode(17);
        level2right.setLeft(level3left2);
        level2right.setRight(level3right2);
        return root;
    }

    public static void preorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (null == treeNode) {
            return;
        }
        sb.append(treeNode.getVal()+",");
        preorderTraversal(treeNode.getLeft(),sb);
        preorderTraversal(treeNode.getRight(),sb);
    }
    public static void inorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (null == treeNode) {
            return;
        }
        inorderTraversal(treeNode.getLeft(),sb);
        sb.append(treeNode.getVal()+",");
        inorderTraversal(treeNode.getRight(),sb);
    }

    public static void postorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (null == treeNode) {
            return;
        }
        postorderTraversal(treeNode.getLeft(),sb);
        postorderTraversal(treeNode.getRight(),sb);
        sb.append(treeNode.getVal()+",");
    }


}
