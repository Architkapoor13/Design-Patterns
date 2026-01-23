package org.designPatterns.Abstract;

public class OperationsDepartmentFactory extends  DepartmentAbstractFactory{
    @Override
    public Department getDepartment() {
        return new OperationsDepartment();
    }
}
