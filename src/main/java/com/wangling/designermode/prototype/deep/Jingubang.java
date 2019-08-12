package com.wangling.designermode.prototype.deep;

import java.io.Serializable;

/**
 * 创建引用对象,一定要注意序列化否则报错
 */
public class Jingubang implements Serializable {
    private float l = 10;
    private float w = 2;

    public void small(){
        l /= 2;
        w /= 2;
    }

    public void big(){
        l *= 2;
        w *= 2;
    }
}
