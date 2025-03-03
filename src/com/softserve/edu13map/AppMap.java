package com.softserve.edu13map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AppMap {
    public static void main(String[] args) {
        Map<Object, String> map = new HashMap<>();
        // Map<Object, String> map = new TreeMap<>(new MyComp());
        //Map<Object, String> map = new TreeMap<>();
        map.put("key1", "one");
        map.put(new Object(), "two");
        map.put(1, "3"); // autoboxit new Integer(1);
        map.put(new Object(), "three");
		map.put(4, null);
		map.put(5, null);
        map.put(null, "is_simple_null");
        //
        System.out.println("map = " + map);
        map.put(null, "is_second_null");
        System.out.println("next map = " + map);
        //
        // /*-
        System.out.println("1. First");
        for (Map.Entry<Object, String> entry : map.entrySet()) {
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        // */
        // /*-
        //map.replace(1, "33333");
		map.put(1, "322222");
        String res = map.remove(1);
        System.out.println("\tres = " + res);
        //
        System.out.println("2. Second");
        for (Iterator<Map.Entry<Object, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
            Map.Entry<Object, String> entry = i.next();
            System.out.println("key = " + entry.getKey() + " value = " + entry.getValue());
        }
        //
        res = map.remove(2);
        System.out.println("\tres = " + res);
        //
        System.out.println("element by \"key1\" = " + map.get("key1"));
        System.out.println("non existing element by \"key12\" = " + map.get("key12"));
        // */
    }
}
