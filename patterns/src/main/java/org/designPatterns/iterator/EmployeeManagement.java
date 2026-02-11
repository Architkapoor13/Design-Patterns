package org.designPatterns.iterator;

import java.util.ArrayList;

public class EmployeeManagement {

    private ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(this.employees);
    }
}
