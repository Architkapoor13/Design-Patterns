package org.designPatterns.Abstract;

public class OperationsDepartment implements Department{
    @Override
    public String getDepartment() {
        return "Operations";
    }

    @Override
    public Integer getDepartmentId() {
        return 50;
    }
}
