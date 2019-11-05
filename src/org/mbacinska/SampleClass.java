package org.mbacinska;

public class SampleClass {

    private Integer x;

    public SampleClass(Integer x) {
        System.out.println("in constructor");
        this.x = x;
    }

    public Integer getX() {
        return x;
    }
}
