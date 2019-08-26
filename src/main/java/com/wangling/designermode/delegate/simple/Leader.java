package com.wangling.designermode.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {

    private Map<String , IEmployee> target = new HashMap<>();

    public Leader(){
        target.put("页面",new EmployeeA());
        target.put("APP",new EmployeeB());
    }

    @Override
    public void doing(String command) {
       target.get(command).doing(command);
    }
}
