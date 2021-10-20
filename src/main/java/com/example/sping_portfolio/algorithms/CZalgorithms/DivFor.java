package com.example.sping_portfolio.algorithms.CZalgorithms;

public class DivFor extends _Division {
    // zero and one argument constructors, both defer to super
    public DivFor() { super(); }
    public DivFor(int nth) {
        super(nth);
    }

    /*
    Abstract Polymorphic "init()" method using For
     */
    @Override
    protected void init() {
        super.name = "DivFor";
        long x = (long) 2.0;
        long limit = super.size;
        // for loops are likely the most common iteration structure, all the looping facts are in one line
        for (long[] f = new long[]{0, 100000}; limit-- > 0; f = new long[]{f[1], f[1]/x})
            super.setData(f[0]);
    }

    /*
    Class method "main" with purpose of testing DivFor
     */
    public static void main(String[] args) {
        _Division fibonacci = new DivFor(); // "DivFor" is used as initializer for the "_Division fibonacci"  object
        fibonacci.print();
    }
}

