package com.example.demo.algorithm.other;

public class CountPrimes {
//    public int countPrimes(int n) {
//        int count = 0;
//        for (int i = 2; i < n; i++) {
//            if (isPrimes(i)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public boolean isPrimes(int x) {
//        for (int i = 2; i * i <= x; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
