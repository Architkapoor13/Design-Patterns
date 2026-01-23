package org.designPatterns.Abstract;

public class EngineeringDepartment implements Department{
    @Override
    public String getDepartment() {
        return "Engineering";
    }

    @Override
    public Integer getDepartmentId() {
        return 1;
    }
}
