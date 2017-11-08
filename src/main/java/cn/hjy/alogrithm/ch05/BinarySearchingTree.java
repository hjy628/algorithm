package cn.hjy.alogrithm.ch05;

/**
 * Created by hjy on 17-8-29.
 * 二叉查找树
 * 二叉查找树或者是棵空树，或者满足如下几个特性：
 * 1,如果它的左子树不为空，那么它的左子树上的任意节点的值都小于根节点的值
 * 2,如果它的右子树不为空，那么它的右子树上的任意节点的值都大于根节点的值
 * 3,同样，它的左子树和右子树也都是二叉查找树
 * 二叉查找树的查找：
 * 因为二叉查找树的特性，如果我们想知道一个元素k是否存在，则只需要进行递归比较
 * 1,先比较根节点，如果相等，则说明找到了，如果为空，则说明无法找到，查找结束
 * 2,如果k比根节点大，则在这个节点的右子树中查找
 * 3,如果k比根节点小，则在这个节点的左子树中查找
 */
public class BinarySearchingTree {

    private BinaryTreeNode root;

    public BinarySearchingTree(BinaryTreeNode root) {
        this.root = root;
    }

    /**
     *   @Author
     *   @Description   二叉查找树的查找
     *   @Param   data
     *   @Date: 下午3:44 17-8-29
     */
    public BinaryTreeNode search(int data){
        return search(root,data);
    }

    /**
     *   @Author
     *   @Description   递归查找二叉树
     *   @Param   node
     *   @Param   data
     *   @Date: 下午3:43 17-8-29
     */
    private BinaryTreeNode search(BinaryTreeNode node,int data){
        if (node==null){
            return null;
        }else if (node.getData()==data){
            return node;
        }else if (data>node.getData()){
            return search(node.getRightChild(),data);
        }else {
            return search(node.getLeftChild(),data);
        }
    }

    public void insert(int data){
        if (root==null){
            root = new BinaryTreeNode();
            root.setData(data);
        }else {
            searchAndInsert(null,root,data);
        }
    }

    /**
     *   @Author
     *   @Description   递归查找二叉树(如果没有找到，则新建一个最终位置的节点)
     *   @Param   parent
     *   @Param   node
     *   @Param   data
     *   @Date: 下午3:51 17-8-29
     */
    private BinaryTreeNode searchAndInsert(BinaryTreeNode parent,BinaryTreeNode node,int data){
        if (node==null){
            node = new BinaryTreeNode();
            node.setData(data);
            if (data>parent.getData()){
                parent.setRightChild(node);
            }else {
                parent.setLeftChild(node);
            }
            return node;
        }else if (node.getData()==data){
            return node;
        }else if (data>node.getData()){
            return searchAndInsert(node,node.getRightChild(),data);
        }else {
            return searchAndInsert(node,node.getLeftChild(),data);
        }
    }

    public void delete(int data){
        //对根节点直接赋值为空
        if (root.getData()==data){
            root = null;
            return;
        }
        //整个过程都需要直到父节点，因为java是引用传递，不能直接赋值
        //c语言可以用指针
        BinaryTreeNode parent = searchParent(data);
        if (parent==null){
            return;
        }
        BinaryTreeNode node = search(parent,data);
        if (node.getLeftChild()==null&&node.getRightChild()==null){
            //叶子节点直接删除
            if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data){
                parent.setLeftChild(null);
            }else {
                parent.setRightChild(null);
            }
        }else if (node.getLeftChild()!=null&&node.getRightChild()==null){
            //左子树不为空树
            if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data){
                parent.setLeftChild(node.getLeftChild());
            }else {
                parent.setRightChild(node.getLeftChild());
            }
        }else if (node.getLeftChild()==null&&parent.getRightChild()!=null){
            //右子树不为空树
            if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data){
                parent.setLeftChild(node.getRightChild());
            }else {
                parent.setRightChild(node.getRightChild());
            }
        }else {
            //左右子树都不为空树
            //1.查找右子树中最做子节点
            BinaryTreeNode deleteNode = node;   //要删除的节点
            BinaryTreeNode temp = node.getRightChild();  //要删除节点的右子树树根
            if (temp.getLeftChild()==null){
                //如果右子树没有左孩子，直接上移
                temp.setLeftChild(deleteNode.getLeftChild());
            }else {
                //右子树的左孩子不为空
                while (temp.getLeftChild()!=null){
                    node = temp;
                    temp = temp.getLeftChild();
                }
                //2.继承节点原右子树上移
                node.setLeftChild(temp.getRightChild());
                //3.继承节点就位
                temp.setLeftChild(deleteNode.getLeftChild());
                temp.setRightChild(deleteNode.getRightChild());
            }
            //4.更新父节点为删除节点的原父节点
            if (parent.getLeftChild()!=null&&parent.getLeftChild().getData()==data){
                parent.setLeftChild(temp);
            }else {
                parent.setRightChild(temp);
            }
        }
    }



    /**
     *   @Author
     *   @Description   二叉查找树查找父节点
     *   @Param   node
     *   @Param   data
     *   @Date: 下午3:58 17-8-29
     */
    private BinaryTreeNode searchParent(int data){
        return searchParent(null,root,data);
    }

    /**
     *   @Author
     *   @Description   递归查找二叉树
     *   @Param   node
     *   @Param   data
     *   @Date: 下午3:58 17-8-29
     */
    private BinaryTreeNode searchParent(BinaryTreeNode parent,BinaryTreeNode node,int data){
        if (node==null){
            return null;
        }else if (node.getData()==data){
            return parent;
        }else if (data>node.getData()){
            return searchParent(node,node.getRightChild(),data);
        }else {
            return searchParent(node,node.getLeftChild(),data);
        }
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
            System.out.println(node.getData());
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


    public BinaryTreeNode getRoot() {
        return root;
    }
}
