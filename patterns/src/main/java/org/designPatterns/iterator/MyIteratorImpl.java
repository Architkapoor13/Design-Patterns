package org.designPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator{

    private List<Employee> employeeList = new ArrayList<>();
    private Integer position;

    public MyIteratorImpl(List<Employee> employeeList){
        this.employeeList = employeeList;
        position = 0;
    }

    @Override
    public Boolean hasNext() {
        if(position >= employeeList.size()) return false;
        return true;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return employeeList.get(position++);
        }
        return null;
    }
}
