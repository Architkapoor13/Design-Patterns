package org.designPatterns.Builder;

public class BuilderMain {

    public static void main(String[] args) {
        Department department = new Department.DepartmentBuilder()
                .setId("123")
                .setName("HR")
                .build();

        System.out.println(department);
    }
}
