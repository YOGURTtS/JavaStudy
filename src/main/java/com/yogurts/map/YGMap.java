package com.yogurts.map;

import com.yogurts.collection.YGLinkedList;

/* 字典 = 数组 + 链表 */
public class YGMap {


    class YGEntry {
        private Object key;
        private Object value;

        public YGEntry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

    YGLinkedList[] arr = new YGLinkedList[999];
    int size;

    /* 添加键值对 */
    public void put(Object key, Object value) {
        YGEntry entry = new YGEntry(key, value);
        // 根据哈希值得到index
        int index = key.hashCode() % arr.length;
        // 该index对应的值为空
        if (arr[index] == null) {
            // 新建链表，将键值对添加进链表
            YGLinkedList linkedList = new YGLinkedList();
            linkedList.add(entry);
            arr[index] = linkedList;
            size++;
        } else {
            // 该index对应的值不为空
            YGLinkedList linkedList = arr[index];
            for (int i = 0; i < linkedList.size(); ++i) {
                YGEntry oldEntry = (YGEntry) linkedList.get(i);
                // key已经存在，覆盖value
                if (oldEntry.getKey().equals(key)) {
                    oldEntry.setValue(value);
                    return;
                }
            }
            // key不存在，添加数据
            arr[index].add(entry);
            size++;
        }
    }

    /* 根据键获取值 */
    public Object get(Object key) {
        int index = key.hashCode() % arr.length;
        if (arr[index] != null) {
            YGLinkedList linkedList = arr[index];
            for (int i = 0; i < linkedList.size(); ++i) {
                YGEntry entry = (YGEntry) linkedList.get(i);
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    /* 返回size */
    public int size() {
        return size;
    }

//    /* 是否包含key */
//    public boolean containsKey(Object key) {
//        for (int i = 0; i < size; ++i) {
//            if (arr[i].getKey().equals(key)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    /* 是否包含value */
//    public boolean containsValue(Object value) {
//        for (int i = 0; i < size; ++i) {
//            if (arr[i].getValue().equals(value)) {
//                return true;
//            }
//        }
//        return false;
//    }


    public static void main(String[] args) {
//        Map map = new HashMap();
//        map.put("key", "value");
//        System.out.println(map);
//
//        String value = (String) map.get("key");
//        System.out.println(value);

        YGMap map = new YGMap();
        map.put("key", "value");
        map.put("key", "value1");
        System.out.println(map.get("key"));
    }
}
