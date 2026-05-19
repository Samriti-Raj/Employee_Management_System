package com.Crud.Employee.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name = "Employee_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;

    @Column(name = "Employee_name")
    private String employeeName;

    @Column(name = "Employee_desc")
    private String employeeDescription;

    public Employee() {}

    public Employee (String employeeName,String employeeDescription) {
        this.employeeName = employeeName;
        this.employeeDescription = employeeDescription;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDescription(String employeeDescription) {
        this.employeeDescription = employeeDescription;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDescription() {
        return employeeDescription;
    }

    public String to_String() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDescription='" + employeeDescription + '\'' +
                '}';
    }
}
