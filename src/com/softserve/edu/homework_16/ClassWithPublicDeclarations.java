package com.softserve.edu.homework_16;

class ClassWithPublicDeclarations {
    public String name;

    public ClassWithPublicDeclarations() {
    }

    public ClassWithPublicDeclarations(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
