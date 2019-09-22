package org.mbacinska;

public class TempFile {


    private class Inner {
        int values1;
        int values2;

        int valueGreater;
        int valueMax;
        int valueMin;

        void greater() {
            valueGreater =
                    values1 > values2
                            ? values1
                            : values2;
        }

        void showGreater() {
            int temp =
                    values1 > values2
                            ? values1
                            : values2;
            System.out.println(temp);
        }

        void minmax() {
            valueMax =
                    values1 > values2
                            ? values1
                            : values2;
            valueMin =
                    values1 < values2
                            ? values1
                            : values2;
        }

        int min() {
            return
                    values1 < values2
                            ? values1
                            : values2;
        }

        int max() {
            return
                    values1 > values2
                            ? values1
                            : values2;
        }
    }

}
