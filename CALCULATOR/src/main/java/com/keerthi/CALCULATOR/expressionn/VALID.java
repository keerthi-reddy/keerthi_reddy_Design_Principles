package com.keerthi.CALCULATOR.expressionn;

public class VALID {
    public static boolean validateExp(Expression exp) {
        if(exp==null)
            return false;
        return exp.getSign()!=null && exp.getFirst()!=null && exp.getSecond() !=null;
    }
}
