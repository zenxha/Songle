package com.example.sping_portfolio.algorithms.CZalgorithms;

import com.example.sping_portfolio.algorithms.CZalgorithms._Division;

public class DivWhile extends _Division {
    public DivWhile() {
        super();
    }
    public DivWhile(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using While
    */
    @Override
    protected void init() {
        super.name = "DivWhile";

        long limit = super.size + 1;
        long[] f = new long[]{0, 100000};
        while (limit-- > 0) {
            super.setData(f[0]);
            f = new long[]{f[1], f[1]/2};
        }
    }

    /*
    Class method "main" with purpose of testing DivWhile
     */
    public static void main(String[] args) {
        _Division fibonacci = new com.example.sping_portfolio.algorithms.CZalgorithms.DivWhile();
        fibonacci.print();
    }
}
