package com.wangling.designermode.factory.factoryMethod;

import com.wangling.designermode.factory.comm.ICourse;
import com.wangling.designermode.factory.comm.PythonCourse;

public class PythonFactory implements ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}