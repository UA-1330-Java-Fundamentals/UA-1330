package com.softserve.collections2.homeworks123;

import java.util.*;

public class applpractive {


    public static void main(String[] args) {
        List<NewStudent> list = new LinkedList<NewStudent>();
        list.add(new NewStudent("Igor"));
        list.add(new NewStudent("Olexandra"));
        list.add(new NewStudent("Anton"));
        Collections.sort(list);
        System.out.println(list);
    }

    }

