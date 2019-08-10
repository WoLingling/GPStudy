package com.wangling.designermode.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton s1 = EnumSingleton.getInstance();
        s1.setData(new Object());

        try
        {
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            EnumSingleton s2 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(s1.getData());
            System.out.println(s2.getData());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
