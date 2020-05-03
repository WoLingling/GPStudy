package com.wangling.designermode.factory.simpleFactory;

import com.wangling.designermode.factory.comm.ICourse;
import com.wangling.designermode.factory.comm.JavaCourse;
import com.wangling.designermode.factory.comm.PythonCourse;

/**
 * 简单工厂违反开闭原则
 */
public class SimpleFactory {
    public ICourse create(String name){

        System.out.println("测试");
        System.out.println("second test");

        if("Java".equals(name)){
            return new JavaCourse();
        }else if ("Python".equals(name)){
            return new PythonCourse();
        }else if ("第二次测试的第三个提交".equals(name)) {
            System.out.println("目的是让先不更新直接修改提交给产生冲突");
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
            e.printStackTrace();
        }
        return null;
    }
}
