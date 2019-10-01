package org.mbacinska;

    public class MySingleton {

        public MySingleton() {
        }

        private static MySingleton instatnce;

        static public MySingleton getInstatnce(){
            return instatnce;
        }
        void dummy(){
            System.out.println("______________");
        }
    }

