package org.designPatterns.iterator;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();

        employeeManagement.addEmployee(new Employee("emp1", 1L));
        employeeManagement.addEmployee(new Employee("emp2", 2L));
        employeeManagement.addEmployee(new Employee("emp3", 3L));
        employeeManagement.addEmployee(new Employee("emp4", 4L));
        employeeManagement.addEmployee(new Employee("emp5", 5L));
        MyIterator iterator = employeeManagement.getIterator();

        while(iterator.hasNext()){
            Employee emp = (Employee) iterator.next();
            System.out.println(emp.getName() + " " + emp.getId());
        }
    }
}
