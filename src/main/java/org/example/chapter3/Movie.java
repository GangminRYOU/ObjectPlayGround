package org.example.chapter3;

public class Movie {
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Money caculateMovieFee(Screening screening){
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
