package com.yogurts.collection;

public class YGLinkedList {

    private YGNode first;
    private YGNode last;

    private int size;

    /* 根据索引返回数据 */
    public Object get(int index) {
        YGNode temp = node(index);
        if (temp == null) {
            return null;
        } else {
            return temp.getObj();
        }
    }

    /* 添加数据 */
    public void add(Object obj) {
        if (first == null) {
            YGNode node = new YGNode(null, obj,null);

            first = node;
            last = node;

        } else {
             // 在last节点后增加新的节点
             YGNode node = new YGNode(last, obj, null);

             last.setNext(node);
             last = node;
        }

        size++;
    }

    /* 删除数据 */
    public boolean remove(int index) {
        YGNode temp = node(index);
        if (temp != null) {

            if (temp == first) { // 头节点
                first = temp.getNext();
                first.setPrevious(null);
            } else if (temp == last) { // 尾节点
                last = temp.getPrevious();
                last.setNext(null);
            } else { // 中间节点
                YGNode previousNode = temp.getPrevious();
                YGNode nextNode = temp.getNext();
                previousNode.setNext(nextNode);
            }
            temp = null;
            size--;
            return true;
        } else {
            return false;
        }

    }

    /* 插入数据 */
    public boolean insert(int index, Object obj) {
        YGNode temp = node(index);
        if (temp != null) {
            YGNode node = new YGNode(obj);

            if (temp == first) { // 头节点
                node.setNext(first);
                node.setPrevious(null);
                first = node;
            } else { // 非头节点
                node.setPrevious(temp.getPrevious());
                node.setNext(temp);
                temp.getPrevious().setNext(node);
                temp.setPrevious(node);
            }
            size++;
            return true;
        }
        return false;
    }

    /* 替换数据 */
    public boolean replace(int index, Object obj) {
        YGNode temp = node(index);
        if (temp != null) {
            temp.setObj(obj);
            return true;
        }
        return false;
    }

    /* 返回节点 */
    public YGNode node(int index) {
        rangeCheck(index);

        YGNode temp = null;
        if (first != null) {
            temp = first;
            for (int i = 0; i < index; ++i) {
                temp = temp.getNext();

            }
        }
        return temp;
    }

    /* 链表的size */
    public int size() {
        return size;
    }

    /* 检查索引 */
    private void rangeCheck(int index) {
        if (index < 0 || index >= size) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        YGLinkedList linkedList = new YGLinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
//        linkedList.replace(2,"4");
        linkedList.insert(2,"5");

        System.out.println(linkedList.size());
        System.out.println(linkedList.get(3));
    }


}
