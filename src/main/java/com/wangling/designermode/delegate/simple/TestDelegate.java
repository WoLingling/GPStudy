package com.wangling.designermode.delegate.simple;

public class TestDelegate {
    public static void main(String[] args) {

        //客户请求（Boss）；委派者(Leader)；被委派者(target)

       Boss boss = new Boss();
       boss.command("APP",new Leader());
    }
}
