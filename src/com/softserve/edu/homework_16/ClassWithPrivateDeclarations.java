package com.softserve.edu.homework_16;

class ClassWithPrivateDeclarations {
    private String name;

    private ClassWithPrivateDeclarations() {
    }

    private ClassWithPrivateDeclarations(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
