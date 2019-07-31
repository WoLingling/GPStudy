package com.wangling.designermode.factoryMethod;

import com.wangling.designermode.comm.ICourse;
import com.wangling.designermode.comm.JavaCourse;

public class JavaFactory implements ICourseFactory{
    public ICourse create() {
        return new JavaCourse();
    }
}
