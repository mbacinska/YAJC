package org.mbacinska;

public class SimpleSingleton {

    public static void main(String[] args) {
        MySingleton singleton = new MySingleton();
        MySingleton.getInstatnce().dummy();
    }

}
