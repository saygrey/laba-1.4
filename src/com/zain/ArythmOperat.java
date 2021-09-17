package com.zain;

import java.util.Scanner;

public abstract class ArythmOperat {
    ArythmOperat(int firstInNum,int secInNum){
        firstNum=firstInNum;
        secNum=secInNum;
    }
    int firstNum;
    int secNum;
    protected abstract int result();

    protected void printRes(){
        System.out.println("Result = "+result());
    }
}
