package com.trainings;

public interface Weightable {

    int getWeight();
    default int getWeightAlternative(){//jesli nie ma w klasie tej metody, to weż te gotowa metode z interfejsu
        return 0;
    }


}
