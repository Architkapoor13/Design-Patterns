package org.designPatterns.Factory;

public class DepartmentFactory {

    public static Department getDepartment(String department){
        switch(department){
            case "IT":
                return new ITDepartment();
            case "HR":
                return new HRDepartment();
            case "Engineering":
                return new EngineeringDepartment();
            default:
                return null;
        }
    }
}
