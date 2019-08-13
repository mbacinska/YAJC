package com.mbacinska;

public class Recursion {
    static int sumFunction(int max){
        System.out.println("argument:"+max);
        if(max==1){
            System.out.println("will return:" +1);
            return max;
        }
        int result = sumFunction(max-1)+max;
        System.out.println("will return:"+result);
        return result;
    }
    public static void main(String[] args) {
        int result = sumFunction(4);
        System.out.println("total result: "+result);

    }
}
