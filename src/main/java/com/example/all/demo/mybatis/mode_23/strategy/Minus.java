package com.example.all.demo.mybatis.mode_23.strategy;

public class Minus extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
