package com.wangling.designermode.proxy.CGLibProxy;

public class TestCGLibProxy {
    public static void main(String[] args) {
        Customer c = (Customer)new CGLibMeipo().getInstance(Customer.class);
        c.findLover();
    }
}
