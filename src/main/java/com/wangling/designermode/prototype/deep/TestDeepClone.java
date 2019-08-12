package com.wangling.designermode.prototype.deep;


public class TestDeepClone {
    public static void main(String[] args) {
        QiTianDaSheng sunyukong = new QiTianDaSheng();

        try {
            QiTianDaSheng deepMonkey = (QiTianDaSheng) sunyukong.clone();

            QiTianDaSheng shallowMonkey = sunyukong.shallowClone();

            System.out.println("deep: "+(sunyukong.getJingubang()==deepMonkey.getJingubang()));
            System.out.println("shallow: "+(sunyukong.getJingubang()==shallowMonkey.getJingubang()));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
