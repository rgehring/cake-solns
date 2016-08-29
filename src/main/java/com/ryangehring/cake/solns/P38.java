package com.ryangehring.cake.solns;

/**
 * Created by rgehring on 8/29/16.
 */
public class P38 {

    public int rand7() {

        int total = 0 ;

        for (int i=0; i<7; i++){
            total = total + rand5();
        }

        return total / 7 ;

    }

    private int rand5() {
        return (int) (5 * Math.random()) + 1;
    }

}
