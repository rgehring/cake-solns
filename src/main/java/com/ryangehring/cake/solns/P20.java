package com.ryangehring.cake.solns;

import java.util.Stack;

/**
 * max stack
 */
public class P20 extends Stack {

    private Stack maxes ;

    public P20() {
        maxes = new Stack() ;
    }

    @Override
    public Object push(Object item)  {
        if (maxes.empty()) {
            maxes.push(item);
        } else {
            Object max = maxes.peek();
            if ((Integer) item >= (Integer) max) maxes.push(item);
        }
        return super.push(item);
    }

    @Override
    public synchronized Object pop() {
        Object test = peek() ;
        if (test == maxes.peek()) {
            maxes.pop() ;
        }
        return super.pop();
    }

    public Object getMax() {
        if (maxes.empty()) return null ;
        return maxes.peek() ;
    }
}
