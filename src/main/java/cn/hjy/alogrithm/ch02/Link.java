package cn.hjy.alogrithm.ch02;

/**
 * Created by hjy on 17-8-16.
 */
public class Link {

    private int size = 0;

    private Node first;

    private Node last;

    /**
     * @Author
     * @Description 链表的初始化
     * @Date: 下午2:35 17-8-16
     */
    public Link() {

    }

    /**
     * @Author
     * @Description 链表后部插入
     * @Date: 下午2:36 17-8-16
     */
    public void addLast(int data) {
        if (size == 0) {
            //为空则初始化前后元素
            fillStart(data);
        } else {
            Node node = new Node();
            node.setData(data);
            last.setNext(node);
            last = node;    //把最后插入的元素设置为链表尾的元素
        }
        size++;
    }

    /**
     * @Author
     * @Description 链表头部插入
     * @Param data
     * @Date: 下午2:41 17-8-16
     */
    public void addFirst(int data) {
        if (size == 0) {
            fillStart(data);
        } else {
            Node node = new Node();
            node.setData(data);
            node.setNext(first);    //把元素的下一个位置的指针指向头元素
            first = node;   //把刚刚插入的元素设置为链表头元素
        }
        size++;
    }

    /**
     * @Author
     * @Description 在链表指定的位置后面插入
     * @Param data 需要插入的数据
     * @Param index 下标从0开始
     * @Date: 下午2:44 17-8-16
     */
    public void add(int data, int index) {
        if (size > index) {
            if (size == 0) {
                //为空初始化前后元素
                fillStart(data);
                size++;
            } else if (index == 0) {
                addFirst(data);
            } else if (size == index + 1) {
                //最后直接调用addLast
                addLast(data);
            } else {
                Node temp = get(index);
                Node node = new Node();
                node.setData(data);
                node.setNext(temp.getNext());
                temp.setNext(node);
                size++;
            }
        } else {
            throw new IndexOutOfBoundsException("位置超过链表长度");
        }
    }

    /**
     * @Author
     * @Description 删除链表头元素
     * @Date: 下午2:54 17-8-16
     */
    public void removeFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表为空");
        } else if (size == 1) {
            //只剩一个时需要清除first和last
            clear();
        } else {
            Node temp = first;
            first = temp.getNext();
            temp = null;    //帮助空间回收
            size--;
        }
    }

    /**
     * @Author
     * @Description 删除链表尾部元素
     * @Date: 下午2:57 17-8-16
     */
    public void removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表为空");
        } else if (size == 1) {
            //只剩一个时需要清除first和last
            clear();
        } else {
            Node temp = get(size - 2);    //获取最有一个元素之前的一个元素
            temp.setNext(null); //帮助空间回收
            size--;
        }
    }

    /**
     * @Author
     * @Description 删除链表中间的元素
     * @Param index
     * @Date: 下午2:58 17-8-16
     */
    public void removeMiddle(int index) {
        if (size == 0) {
            throw new IndexOutOfBoundsException("链表为空");
        } else if (size == 1) {
            //只剩一个时需要清除first和last
            clear();
        } else {
            if (index == 0) {
                removeFirst();
            } else if (size == index - 1) {
                removeLast();
            } else {
                Node temp = get(index - 1);//获取要删除的元素之前的一个元素
                Node next = temp.getNext();
                temp.setNext(next.getNext());
                next = null;//帮助空间回收
                size--;
            }
        }
    }


    /**
     * @Author
     * @Description 获取指定下标元素
     * @Param index
     * @Date: 下午2:49 17-8-16
     */
    public Node get(int index) {
        Node tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp;
    }

    /**
     * @Author
     * @Description 打印所有元素的数据
     * @Date: 下午2:51 17-8-16
     */
    public void printAll() {
        // 也可用do..while实现
        Node tmp = first;
        System.out.println(tmp.getData());
        for (int i = 0; i < size - 1; i++) {
            tmp = tmp.getNext();
            System.out.println(tmp.getData());
        }
    }

    public int size() {
        return size;
    }

    /**
     * @Author
     * @Description 在链表中插入第一个元素时，头、尾元素都是一个元素
     * @Param data
     * @Date: 下午2:38 17-8-16
     */
    private void fillStart(int data) {
        first = new Node();
        first.setData(data);
        last = first;
    }

    /**
     * @Author
     * @Description 在元素只有一个时清除first和last元素
     * @Date: 下午2:39 17-8-16
     */
    private void clear() {
        first = null;
        last = null;
        size = 0;
    }

}
