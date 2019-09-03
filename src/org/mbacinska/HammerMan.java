package org.mbacinska;

public class HammerMan {

    public static void main(String[] args) {
        HammerPiece handle = new HammerPiece("black", 15);
        HammerPiece head = new HammerPiece("yellow", 7);
        //AbstractHammer hammer = new AbstractHammer() ---> nie można tworzyc obiektów dla klasy abstrakcyjnej


        AbstractHammer hammer = new Hammer(handle, head);//tak można, bo Liskov substitution principle
        hammer.hit();//wywoła metodę hit() z klasy Hammer
       // hammer1.hammers("nails"); //nie można, bo obiekt jest AbstractHammer a tam nie ma metody hammers()
        Hammer hammer1 = new Hammer(handle,head);
        hammer1.hit();
        hammer1.hammers("nails");// klasa Hammer ma metode hammers()

    }
}
