package org.mbacinska;

public class SampleClass {

    static Integer staticX =  show("class init value", 1100);

    static {
        staticX = show("static init block", 9999);
    }

    private Integer x = show("instance init value", 11);
    private int y = 0;

    {
        x = show("init block", 50);
    }

    public SampleClass() {
        this(1500100);
        this.x =  show("constructor", 21);
    }

    public SampleClass(Integer x) {
//        this();

        show("in constructor", x);
        this.x =  x;

      //  this.x  = staticX;



    }

    public Integer getX() {
        return x;
    }


    private static Integer show(String message, Integer value) {
        System.out.println( message + " " + value);
        return value;
    }
}