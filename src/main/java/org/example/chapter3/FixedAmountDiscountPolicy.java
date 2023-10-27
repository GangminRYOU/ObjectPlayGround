package org.example.chapter3;

public class FixedAmountDiscountPolicy implements DiscountPolicy {
    public static final int fixedAmount = 300;
    public int calculateDiscountAmount(Screening screening){
        return fixedAmount;
    }
}
