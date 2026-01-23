package org.designPatterns.Abstract;

import org.designPatterns.Abstract.DepartmentFactory;

public class AbstractMain {

    public static void main(String[] args) {
        Department department1 = DepartmentFactory.getDepartment(new HRDepartmentFactory());
        Department department2 = DepartmentFactory.getDepartment(new ITDepartmentFactory());
        Department department3 = DepartmentFactory.getDepartment(new OperationsDepartmentFactory());
        System.out.println(department1.getDepartment() + " " + department1.getDepartmentId());
        System.out.println(department2.getDepartment() + " " + department2.getDepartmentId());
        System.out.println(department3.getDepartment() + " " + department3.getDepartmentId());
    }
}
