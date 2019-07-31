package com.wangling.designermode.factoryMethod;

import com.wangling.designermode.comm.ICourse;
import com.wangling.designermode.comm.JavaCourse;
import com.wangling.designermode.comm.PythonCourse;

public class PythonFactory implements ICourseFactory{
    public ICourse create() {
        return new PythonCourse();
    }
}