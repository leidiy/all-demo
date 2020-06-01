package com.example.all.demo.mybatis.mode_23.strategy;

public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] split = split(exp, "\\*");
        return split[0] * split[1];
    }
}
