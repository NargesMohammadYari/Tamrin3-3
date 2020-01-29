package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws EtelaatExp {
	Scanner scanner=new Scanner(System.in);
        System.out.println("nam va vorodi khod ra vared konid");
        String nam=scanner.nextLine();
        int sal=scanner.nextInt();
        NamExp namExp=new NamExp();
        SalExp salExp=new SalExp();
        namExp.name(nam);
        salExp.sal(sal);
    }
}
