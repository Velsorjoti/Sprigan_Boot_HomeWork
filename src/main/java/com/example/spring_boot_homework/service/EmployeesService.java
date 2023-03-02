package com.example.spring_boot_homework.service;

import com.example.spring_boot_homework.entity.Employees;

import java.util.List;

public interface EmployeesService {
    List<Employees> getEmployees();
    Employees getEmployeesById(int id);
    void addEmployees(Employees employees);
    void updateEmployees(Employees employees);
    void deleteEmployees(int id);
}
