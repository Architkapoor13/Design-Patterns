package org.designPatterns.Factory;

public class FactoryMain {

    public static void main(String[] args) {
        Department department = DepartmentFactory.getDepartment("Engineering");
        if(department != null)
            System.out.println(department.getDepartmentName());
    }
}
