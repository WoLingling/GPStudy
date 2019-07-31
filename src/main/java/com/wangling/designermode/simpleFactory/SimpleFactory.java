package com.wangling.designermode.simpleFactory;

import com.wangling.designermode.comm.ICourse;
import com.wangling.designermode.comm.JavaCourse;
import com.wangling.designermode.comm.PythonCourse;

//简单工厂违反开闭原则
public class SimpleFactory {
    public ICourse create(String name){
        if("Java".equals(name)){
            return new JavaCourse();
        }else if ("Python".equals(name)){
            return new PythonCourse();
        }
        else {
            return new JavaCourse();
        }
//        try{
//             return (ICourse) Class.forName(name).newInstance();
//        }
//        catch(Exception e){
//
//        }
//        return null;
    }

    public ICourse create(Class<? extends ICourse> clazz){

        try{
            return  clazz.newInstance();
        }
        catch(Exception e){

        }
        return null;
    }
}
