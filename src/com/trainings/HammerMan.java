package com.trainings;


public class HammerMan {


    public static void main(String[] args) {
        HammerPiece handle = new HammerPiece("black", 15);
        HammerPiece head = new HammerPiece("yellow", 7);
        //AbstractHammer hammer = new AbstractHammer() ---> nie można tworzyc obiektów dla klasy abstrakcyjnej


        AbstractHammer hammer = new Hammer(handle, head);//tak można, bo Liskov substitution principle
        hammer.hit();//wywoła metodę hit() z klasy Hammer
        // hammer1.hammers("nails"); //nie można, bo obiekt jest AbstractHammer a tam nie ma metody hammers()
        Hammer hammer1 = new Hammer(handle, head);
        hammer1.hit();
        hammer1.hammers("nails");// klasa Hammer ma metode hammers()

        System.out.println(getDoubleWeight(hammer));
        System.out.println(getDoubleWeight(handle));
        System.out.println(getDoubleWeight(head));
        Weightable anything = new Hammer(handle, head);//tak tez mozna
        //System.out.println(anything.getWeight());nie wiem co sie dzieje
        System.out.println(getDoubleWeight(anything));

        AbstractHammer hammer19 = new Hammer(handle,head);//jeden obiekt, ale dwa wskazniki do niego hammer19 & anything19
        Weightable anything19 = hammer19;
        System.out.println(getDoubleWeight(anything19));

    }
    public static int getDoubleWeight(Weightable arg){
        return arg.getWeight()*2;

    }
}
