package org.mbacinska;

public class Simple {

    private final int value;
    private static int availableObjects = 0;

    public Simple(int value) throws OddArgumentException, NoAvailableObjectException{


        if(availableObjects>=5){
            throw new NoAvailableObjectException();
        }
        if (value % 2 != 0) {
            throw new OddArgumentException();
        } else {

            this.value = value;
            availableObjects++;
        }

    }

    public int getValue() {

        return value;
    }
}
