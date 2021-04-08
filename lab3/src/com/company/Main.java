package com.company;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
	  double h,vol,r,pi=3.14;
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter values for height and radius");
	  h=in.nextDouble();
	  r=in.nextInt();
	  vol=pi*r*r*h;
	  System.out.println("RADIUS IS: " + r);
	  System.out.println("HEIGHT IS: " + h);
	  System.out.println("VOLUME IS: " + vol);

    }
}
