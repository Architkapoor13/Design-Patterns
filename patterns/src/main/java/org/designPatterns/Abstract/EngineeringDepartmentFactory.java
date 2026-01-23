package org.designPatterns.Abstract;

public class EngineeringDepartmentFactory extends DepartmentAbstractFactory{
    @Override
    public Department getDepartment() {
        return new EngineeringDepartment();
    }
}
