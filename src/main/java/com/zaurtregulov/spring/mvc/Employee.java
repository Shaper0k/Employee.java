package com.zaurtregulov.spring.mvc;

import jakarta.validation.constraints.NotEmpty;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.validation.annotation.Validated;

@Validated
public class Employee {
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    private int salary;
    private String department;
    private Map<String,String> departments;
    private Map<String,String> carBrands;
    private String [] languages;

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    private String carBrand;

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public Employee() {
        departments= new HashMap<>();
        departments.put("IT","Informational Technology ");
        departments.put("Sales","Sales");
        departments.put("HR","Human Resources ");
        carBrands = new HashMap<>();
        carBrands.put("BMV","BMV");
        carBrands.put("AUDI","AUDI");
        carBrands.put("Mercedes-Benz","Mercedes");


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

}
