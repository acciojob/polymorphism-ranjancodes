package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return -1;
        }
        public int product(int x, int y, int z) {
            return 0;
        }

        public double product(double x, double y) {
            return 1.10;
        }

    }

    public static void main(String[] args) {
        Product p=new Product();
        p.product(0,1);
        p.product(0,1,2);
        p.product(2.1,2.2);

    }

}