package com.zain;

public class Summ extends ArythmOperat{
    Summ(int firstInNum, int secInNum) {
        super(firstInNum, secInNum);
    }

    protected int result(){
        return firstNum+secNum;
    }
}
