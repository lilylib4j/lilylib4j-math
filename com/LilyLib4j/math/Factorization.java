package com.LilyLib4j.math;

public class Factorization {
    public boolean isPrime(int a) {
        boolean prime = false;
        for(int i = 2; i <= a/2; ++i) {
            if(a % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
    public long fermatFactorization(int n) {
        if(isPrime(n) || n % 2 == 0)
            throw new ArithmeticException("ArithmeticException: value of n(" + n + ") cannot be prime or even!");

    }
}
