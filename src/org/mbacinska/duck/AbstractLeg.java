package org.mbacinska.duck;

public abstract class AbstractLeg {

    protected final String name;


    public AbstractLeg(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    abstract void go();
}
