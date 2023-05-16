package CodingRoomSBA;

import java.util.*;

public class Employee {
    // add fields
    private String firstName;
    private String lastName;
    private String department;


    public static void main(String [] args) {
        Employee e = new Employee();
        String[] array = {"Harold Riddle production", "Luciano Zavala r&d"};
        String y = e.toString();
        System.out.println(y);
    }

    // Do not change
    public Employee() {}

    public Employee(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;

    }


    public static ArrayList<Employee> addEmployees(String[] array){
        ArrayList<Employee> employees = new ArrayList<>();
        // add code
        for (String employee : array) {
            String[] details = employee.split(" ");
            Employee e = new Employee(details[0], details[1], details[2]);
            employees.add(e);
        }
        //employees.addToArrayList(array);
        return employees;
    }

    @Override
    public String toString() {
        return ("First Name: " + firstName + "Last Name : " + lastName + "Department:  " + department);
    }

    /// Do not change
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(department, employee.department);
    }


}
