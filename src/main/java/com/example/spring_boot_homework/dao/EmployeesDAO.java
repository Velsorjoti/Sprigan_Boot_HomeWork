package com.example.spring_boot_homework.dao;

import com.example.spring_boot_homework.entity.Employees;

import java.util.List;

public interface EmployeesDAO {
        List<Employees> getEmployees();

        Employees getEmployeesById(int id);

        void addEmployees(Employees employees);

        void updateEmployees(Employees employees);

        void deleteEmployees(int id);
}