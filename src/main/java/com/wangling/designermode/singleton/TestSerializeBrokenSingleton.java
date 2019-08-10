package com.wangling.designermode.singleton;

import java.io.*;

public class TestSerializeBrokenSingleton {
    public static void main(String[] args) {
        SerializableSingleton s1 = SerializableSingleton.getInstance();
        SerializableSingleton s2 = null;
        try {
            FileOutputStream fos = new FileOutputStream("HungrySingleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("HungrySingleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (SerializableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
