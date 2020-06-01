package com.example.all.demo.mybatis.mode_23.template;

public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }


    public static void main(String[] args) {
        String exp = "1+3";
        AbstractCalculator calculator = new Plus();
        System.out.println(calculator.calculate(exp, "\\+"));

    }
}
