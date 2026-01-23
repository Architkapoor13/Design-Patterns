package org.designPatterns.Abstract;

public class HRDepartmentFactory extends DepartmentAbstractFactory{
    @Override
    public Department getDepartment() {
        return new HRDepartment();
    }
}
