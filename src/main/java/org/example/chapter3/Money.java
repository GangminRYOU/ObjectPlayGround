package org.example.chapter3;

public class Money {
    int cost;

    public Money minus(int discountAmount){
        this.cost -= discountAmount;
        return this;
    }
}
