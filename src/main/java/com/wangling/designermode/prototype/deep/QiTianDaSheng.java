package com.wangling.designermode.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * 禁止克隆破环单例，可实现Cloneable接口，返回单例。或者加readResolve方法
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {
    private Jingubang jingubang;

    public QiTianDaSheng(){
        birthday = new Date();
        jingubang = new Jingubang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
//        return this.shallowClone();
    }

    public Jingubang getJingubang() {
        return jingubang;
    }

    public void setJingubang(Jingubang jingubang) {
        this.jingubang = jingubang;
    }

    public QiTianDaSheng shallowClone(){
        QiTianDaSheng copy = new QiTianDaSheng();
        copy.birthday = new Date();
        copy.jingubang = this.jingubang;
        return copy;
    }

    public Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy = (QiTianDaSheng)ois.readObject();

            return copy;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
