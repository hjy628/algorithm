package cn.hjy.alogrithm.ch05;

/**
 * Created by hjy on 17-8-28.
 */
public class BinaryTree {

    private BinaryTreeNode root;

    /**
     *   @Author
     *   @Description   二叉树的创建
     *   @Date: 下午5:46 17-8-28
     */

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     *   @Author
     *   @Description   二叉树的清空
     *   @Date: 下午5:46 17-8-28
     */


    /**
     *   @Author
     *   @Description   清空某个子树的所有节点
     *   @Date: 下午5:48 17-8-28
     */

    public void clear(BinaryTreeNode node){
        if (node!=null){
            clear(node.getLeftChild()); //递归地删除左子节点
            clear(node.getRightChild()); //递归地删除右子节点
            node = null;
        }
    }

    /**
     *   @Author
     *   @Description   清空树
     *   @Date: 下午5:48 17-8-28
     */
    public void clear(){
        clear(root);
    }



    /**
     *   @Author
     *   @Description   判断二叉树是否为空
     *   @Date: 下午5:49 17-8-28
     */
    public boolean isEmpty(){
        return root == null;
    }

    /**
     *   @Author
     *   @Description   获取二叉树的高度
     *   @Date: 下午5:57 17-8-28
     */
    public int height(){
        return height(root);
    }

    /**
     *   @Author
     *   @Description   获取某节点为子树的高度
     *   @Date: 下午5:57 17-8-28
     */
    public int height(BinaryTreeNode node){
        if (node==null){
            return 0;   //递归结束，空子树的高度为0
        }else {
            //递归获取左子树的高度
            int l = height(node.getLeftChild());
            //递归获取右子树的高度
            int r = height(node.getRightChild());
            //高度应该算更高的一边（加1是因为要加上自己这一层）
            return l<r?r+1:l+1;
        }
    }

    /**
     *   @Author
     *   @Description   获取二叉树的节点数
     *   @Date: 下午6:01 17-8-28
     */
    public int size(){
        return size(root);
    }

    /**
     *   @Author
     *   @Description 获取某节点为子树的节点数
     *   @Date: 下午6:00 17-8-28
     */
    public int size(BinaryTreeNode node){
        if (node==null){
            //如果节点为空，则返回节点数为0
            return 0;
        }else {
            //需要计算本节点，所以加1
            //递归获取左子树的节点数及右子树的节点数，最终相加
            return 1+size(node.getLeftChild()) + size(node.getRightChild());
        }
    }

    /**
     *   @Author
     *   @Description   递归查找node节点在二叉树中的父节点
     *   @Param   node
     *   @Date: 下午6:03 17-8-28
     */
    public BinaryTreeNode getParent(BinaryTreeNode node){
        return (root==null||root==node)?null:getParent(root,node);
    }


    /**
     *   @Author
     *   @Description   递归查找node节点在subTree子树中的父节点
     *   @Param   subTree
     *   @Param   node
     *   @Date: 下午6:03 17-8-28
     */
    public BinaryTreeNode getParent(BinaryTreeNode subTree,BinaryTreeNode node){
        if (subTree==null){
            //如果子树为空，则没有父节点
            return null;
        }
        if (subTree.getLeftChild()==node||subTree.getRightChild()==node){
            //如果子树树根的左右孩子节点之一是待查节点，那么这个子树的树根即待查节点的父节点
            return subTree;
        }
        BinaryTreeNode parent = null;
        //先递归在左子树找
        if ((parent=getParent(subTree.getLeftChild(),node))!=null){
            return parent;
        }else {
            //递归在右子树找
            return getParent(subTree.getRightChild(),node);
        }
    }

    /**
     *   @Author
     *   @Description   获取某个节点的左子树
     *   @Date: 上午9:47 17-8-29
     */
    public BinaryTreeNode getLeftTree(BinaryTreeNode node){
        return node.getLeftChild();
    }

    /**
     *   @Author
     *   @Description   获取某个节点的左子树
     *   @Date: 上午9:47 17-8-29
     */
    public BinaryTreeNode getRightTree(BinaryTreeNode node){
        return node.getRightChild();
    }

    //当这个节点本身有字节点是，这样的插入会覆盖原来在这个位置上的节点，另外，虽然插入的是字节点，但其实子节点也可以代表一棵子树
    //因为我们单从这个节点来看并不知道这个节点是否有左右子树存在，所以虽然插入的是一个节点，担忧可能也差入了很多节点进来

    /**
     *   @Author
     *   @Description   给某节点插入左字节点
     *   @Date: 上午9:49 17-8-29
     */
    public void insertLeft(BinaryTreeNode parent,BinaryTreeNode newNode){
        parent.setLeftChild(newNode);
    }

    /**
     *   @Author
     *   @Description   给某节点插入右字节点
     *   @Date: 上午9:49 17-8-29
     */
    public void insertRight(BinaryTreeNode parent,BinaryTreeNode newNode){
        parent.setRightChild(newNode);
    }

    //先根遍历(PreOrder)
    /**
     *   @Author
     *   @Description   先根遍历
     *   @Date: 上午10:10 17-8-29
     */
    public void preOrder(BinaryTreeNode node){
        if (node!=null){
            //visted(node);
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }
    //中根遍历(inOrder)
    /**
     *   @Author
     *   @Description   中根遍历
     *   @Date: 上午10:10 17-8-29
     */
    public void inOrder(BinaryTreeNode node){
        if (node!=null){
            inOrder(node.getLeftChild());
            //visted(node);
            inOrder(node.getRightChild());
        }
    }
    //后根遍历(PostOrder)
    /**
     *   @Author
     *   @Description   后根遍历
     *   @Date: 上午10:10 17-8-29
     */
    public void postOrder(BinaryTreeNode node){
        if (node!=null){
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            //visted(node);
        }
    }

}
