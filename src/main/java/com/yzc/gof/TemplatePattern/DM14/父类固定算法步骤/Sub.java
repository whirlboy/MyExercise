package com.yzc.gof.TemplatePattern.DM14.父类固定算法步骤;

/**
 * <p>减法运算</p>
 */
public class Sub extends AbstractCalculator{

    @Override
    protected double calculate(double numA, double numB) {
        return numA - numB ;
    }

}
