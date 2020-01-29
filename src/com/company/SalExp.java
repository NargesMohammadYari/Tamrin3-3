package com.company;

/**
 * Created by narges nastran on 01/29/2020.
 */
public class SalExp {
    public class sal extends Throwable{}

    public static void sal(int s)throws EtelaatExp{
        if(s!=20){
            System.out.println("shoma daraye sene kafi hastid");
        }else throw new EtelaatExp("sene shoma kafi nist");
    }
}
