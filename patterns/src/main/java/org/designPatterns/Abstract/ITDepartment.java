package org.designPatterns.Abstract;

public class ITDepartment implements Department{
    @Override
    public String getDepartment() {
        return "IT";
    }

    @Override
    public Integer getDepartmentId() {
        return 3;
    }
}
