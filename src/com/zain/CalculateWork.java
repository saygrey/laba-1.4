package com.zain;

import java.util.Scanner;

public class CalculateWork {
    int firstNum;
    int secNum;
    ArythmOperat arythmDeals;
    protected void start(){
     System.out.println("Type 1 - for multiple, 2 - for summ :");
     Scanner in = new Scanner(System.in);
     if (in.nextInt()==1){
         readNums();
         arythmDeals=new Multipl(firstNum,secNum);
     }
     else{
         readNums();
         arythmDeals=new Summ(firstNum,secNum);
     }
     in.close();
     arythmDeals.printRes();
    }
    protected void readNums(){
        Scanner in=new Scanner(System.in);
        System.out.print("First num = ");
        firstNum=in.nextInt();
        System.out.print("Second num = ");
        secNum=in.nextInt();
        in.close();
    }
}
