package com.ants.switchcase;

public class Test {

    public static void main(String[] args) {
        Double salary = getSalary("java");
        System.out.println(salary);
    }

    public static Double getSalary(String skillSet) {
        double salary = 0;
        switch (skillSet) {
            case "java":
                salary = 20000;
                break;
            case "frontend":
                salary = 30000;
                break;
            case "microservices":
                salary = 30000;
                break;
            case "fullstack":
                salary = 50000;
                break;
            default:
                salary = 0;
        }
        return salary;
    }

    public static Double getSalarynew(String skillSet) {
        double salary = switch (skillSet) {
            case "java" -> 20000;
            case "frontend" -> 30000;
            case "microservices" -> 30000;
            case "fullstack" -> 50000;
            default ->0;
        };
        return salary;
    }
}
