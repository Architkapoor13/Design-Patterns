package org.designPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department();
        department.setName("HR");
        department.setToBePromoted(new ArrayList<>(List.of("amit", "raju")));
        System.out.println(department);

        Department clone = department.clone();
        // this shows an example of deepcopy
        department.getToBePromoted().add("shyam");
        department.setName("changed");
        System.out.println(clone);
        System.out.println(department);
    }
}
