package org.designPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;
/**
    this is used when there is a complex logic in the creation of the object of the class,
    so we use clone method to get the new objects so that the complex logic does not repeat on every new object call!
 **/
 public class Department implements Cloneable {

    private String name;
    private List<String> toBePromoted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToBePromoted() {
        return toBePromoted;
    }

    public void setToBePromoted(List<String> toBePromoted) {
        this.toBePromoted = toBePromoted;
    }

    public String toString(){
        return this.name + " " + this.toBePromoted;
    }

    @Override
    public Department clone() throws CloneNotSupportedException {
        Department newDep = new Department();
        newDep.name = this.name;
        List<String> list = new ArrayList<>();
        list.addAll(this.toBePromoted);
        newDep.setToBePromoted(list);
        return newDep;
//        return (Department) super.clone();
    }
}
