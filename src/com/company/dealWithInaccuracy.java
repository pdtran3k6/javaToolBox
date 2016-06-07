package com.company;

import java.math.BigDecimal;

public class dealWithInaccuracy {

    public static void main(String[] args) {
	// write your code here
        // variable declaration
        double a = .012;
        double sum = a + a + a;

        // Inaccuracy will occur. The sum will be 0.036000000000000004
        System.out.println("The sum of a is: " + sum);

        // How to prevent inaccuracy
        String a_Str = Double.toString(a);
        BigDecimal a_BD = new BigDecimal(a_Str);
        BigDecimal a_BD_sum = a_BD.add(a_BD).add(a_BD);

        // The sum will be 0.036
        System.out.println("The sum of a is: " + a_BD_sum.toString());

    }
}
