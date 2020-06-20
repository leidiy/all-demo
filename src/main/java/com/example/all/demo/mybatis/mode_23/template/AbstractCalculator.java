package com.example.all.demo.mybatis.mode_23.template;

/**
 * 模板方法模式：
 * <p>
 * 解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，
 * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 *
 * @author 72082934
 */
public abstract class AbstractCalculator {
    /**
     * 主方法，实现对本类其它方法的调用
     *
     * @param exp
     * @param opt
     * @return
     */
    public final int calculate(String exp, String opt) {
        int array[] = this.split(exp, opt);
        return this.calculate(array[0], array[1]);
    }

    public int[] split(String exp, String opt) {
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }


    /**
     * 被子类重写的方法
     *
     * @param num1
     * @param num2
     * @return
     */
    public abstract int calculate(int num1, int num2);


}
