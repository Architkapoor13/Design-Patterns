package org.designPatterns.Builder;

public class Department {
    private final String id;
    private final String name;

    private Department(DepartmentBuilder departmentBuilder){
        this.id = departmentBuilder.id;
        this.name = departmentBuilder.name;

    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.id + " " + this.name;
    }

    public static class DepartmentBuilder{
        private String id;
        private String name;

        public DepartmentBuilder(){

        }

        public DepartmentBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public DepartmentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Department build(){
            return new Department(this);
        }
    }
}
