package com;

/**
 * Created with IntelliJ IDEA.
 * User: evah
 * Date: 6/12/13
 * Time: 4:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class MeterClass {

    private int length;

    public MeterClass(int length) {

        //update  to  avoid  getting  default value
        this.length = length;


        //To change body of created methods use File | Settings | File Templates.
    }

    public static void main(String[] args) {
        MeterClass meterClass = new MeterClass(6);
        System.out.println(meterClass);

    }


    @Override
    public String toString(){

        return length + "m";

    }
}
