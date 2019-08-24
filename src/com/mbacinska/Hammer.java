package com.mbacinska;



    public class Hammer {

        private String colour;
        private int weight;

        public Hammer(String colour) {
            this.colour = colour;
            this.weight = 10;
        }

        public String getColour() {
            return colour;
        }

        public void hammers(String what) {
            System.out.println(this.getColour() + " hammer hammers " + what);
        }
    }


