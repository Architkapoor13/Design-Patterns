package org.designPatterns.Factory;

public class ITDepartment implements Department{
    @Override
    public String getDepartmentName() {
        return "IT";
    }
}
