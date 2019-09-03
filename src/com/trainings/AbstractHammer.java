package com.trainings;



abstract public class AbstractHammer implements Weightable {
   private HammerPiece handle;
   private HammerPiece head;

    public AbstractHammer(HammerPiece handle, HammerPiece head) {
        this.handle = handle;
        this.head = head;
    }

    public int getWeight(){
        return handle.getWeight() + head.getWeight();
    }

   public String getColour(){
        return handle.getColour()+ "," +head.getColour();
   }

    public abstract void hit();


}
