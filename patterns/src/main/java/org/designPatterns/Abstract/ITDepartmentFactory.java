package org.designPatterns.Abstract;

public class ITDepartmentFactory extends DepartmentAbstractFactory{
    @Override
    public Department getDepartment() {
        return new ITDepartment();
    }
}
