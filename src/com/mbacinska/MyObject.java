package com.mbacinska;

import java.util.Objects;

public class MyObject {

    int something =6;
    long another;

    @Override
    public String toString() {
        return "MyObject{}" + something+ " "+another;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return something == myObject.something &&
                another == myObject.another;
    }

    @Override
    public int hashCode() {
        return Objects.hash(something, another);
    }
}
