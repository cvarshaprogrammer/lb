
package com.company;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        int radius;
        double pi,circ;
        pi=3.14;
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER RADIUS:  ");
        radius=in.nextInt();
        circ=2*pi*radius;
        System.out.println(" RADIUS is :  "+ radius);
        System.out.println(" CIRCUMFERENCE is :  " + circ );

    }
}