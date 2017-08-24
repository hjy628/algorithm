package cn.hjy.alogrithm.ch05;

/**
 * Created by hjy on 17-8-24.
 */
public class TreeNode1Test {
    public static void main(String[] args) {
        TreeNode1[] tree = new TreeNode1[8];
        TreeNode1 treeNode1 = new TreeNode1();
        treeNode1.setParent(-1);
        treeNode1.setData("A");
        tree[0]=treeNode1;
        TreeNode1 treeNode2 = new TreeNode1();
        treeNode2.setParent(0);
        treeNode2.setData("B");
        tree[1]=treeNode2;
        TreeNode1 treeNode3 = new TreeNode1();
        treeNode3.setParent(0);
        treeNode3.setData("C");
        tree[2]=treeNode3;
        TreeNode1 treeNode4 = new TreeNode1();
        treeNode4.setParent(1);
        treeNode4.setData("D");
        tree[3]=treeNode4;
        TreeNode1 treeNode5 = new TreeNode1();
        treeNode5.setParent(1);
        treeNode5.setData("E");
        tree[4]=treeNode5;
        TreeNode1 treeNode6 = new TreeNode1();
        treeNode6.setParent(1);
        treeNode6.setData("F");
        tree[5]=treeNode6;
        TreeNode1 treeNode7 = new TreeNode1();
        treeNode7.setParent(2);
        treeNode7.setData("G");
        tree[6]=treeNode7;
        TreeNode1 treeNode8 = new TreeNode1();
        treeNode8.setParent(2);
        treeNode8.setData("H");
        tree[7]=treeNode8;
        for (int i = 0; i < tree.length; i++) {
            System.out.println(i+":"+tree[i].getParent()+"--"+tree[i].getData());
        }
    }
}
