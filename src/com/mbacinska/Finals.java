package com.mbacinska;

    public class Finals {

        public static void main(String[] args) {

//            InnerFinals innerFinals = new InnerFinals(8);
//            innerFinals = new InnerFinals(11);
//            int simple11 = 11;
//            System.out.println(simple11);
//
//            Integer referenceToIntegerObject1 = new Integer(110);
//            Integer referenceToIntegerObject2 = new Integer(110);
//            System.out.println(referenceToIntegerObject1 == referenceToIntegerObject2);
//
//            int simpleInt = referenceToIntegerObject1;
//            simpleInt = referenceToIntegerObject1.intValue();
//
//            referenceToIntegerObject1 = simpleInt + 10;
//            referenceToIntegerObject1 = new Integer(simpleInt + 10);
//
//            Integer x =1000; // new Integer(1000)
//            x ++;
//
//              new Integer( x.intValue() + 1 )
//
//        }


        class InnerFinals {

            final int value;


            InnerFinals(int value) {

                this.value = value;
            }
        }


    }
