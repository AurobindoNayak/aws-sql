package com.ants.binarysearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee(1,"maa",20000),
                new Employee(2,"bapa",50000),
                new Employee(3,"aa",10000),
                new Employee(4,"xx",5000));

        List<Employee> employeeList1 = employeeList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(employeeList1);
    }
}
