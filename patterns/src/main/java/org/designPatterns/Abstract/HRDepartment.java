package org.designPatterns.Abstract;

public class HRDepartment implements Department{
    @Override
    public String getDepartment() {
        return "HR";
    }

    @Override
    public Integer getDepartmentId() {
        return 2;
    }
}
