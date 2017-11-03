package com.mohaijiang.cloud.authserver;

/**
 * @author mohaijiang on 10/18/17
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(new Client().rangeBitwiseAnd(5,7));
    }

    public int rangeBitwiseAnd(int m, int n) {
        int r=Integer.MAX_VALUE;
        while((m&r)!=(n&r))  r=r<<1;
        return m&r;
    }
}
