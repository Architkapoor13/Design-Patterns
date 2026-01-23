package org.designPatterns.Abstract;

public class DepartmentFactory {
    public static Department getDepartment(DepartmentAbstractFactory departmentAbstractFactory){
        return departmentAbstractFactory.getDepartment();
    }
}
