package com.softserve.edu08err;

import com.softserve.edu08err.arch.Parent;

public class Child extends Parent {

    //@Override
    public int f() {
        System.out.println("\tRunning f() from Child");
        return 2;
    }

    public int useF2() {
        //return useF();
		return f();
    }
}
