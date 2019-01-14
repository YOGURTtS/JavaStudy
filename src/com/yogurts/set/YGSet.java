package com.yogurts.set;

import com.yogurts.map.YGMap;

public class YGSet {

    private YGMap map;
    private static final Object PRESENT = new Object();

    public YGSet() {
        map = new YGMap();
    }

    public void add(Object obj) {
        map.put(obj, PRESENT);
    }

    public int size() {
        return map.size();
    }

    public static void main(String[] args) {
        YGSet set = new YGSet();
        set.add("111");
        System.out.println(set.size());
    }
     
}
