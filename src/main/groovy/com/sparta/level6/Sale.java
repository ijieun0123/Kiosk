package com.sparta.level6;

public enum Sale {
    PERSON_OF_NATIONAL_MERIT(10),
    SOLDIER(5),
    STUDENT(3),
    GENERAL(0);

    private final double discountRate;

    // 생성자
    Sale(double discountRate) {
        this.discountRate = discountRate;
    }

    // Getter 메서드
    public double getDiscountRate() {
        return discountRate;
    }
}
