package com.wangling.designermode.factory.factoryMethod;

import com.wangling.designermode.factory.comm.ICourse;
import com.wangling.designermode.factory.comm.JavaCourse;

public class JavaFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
