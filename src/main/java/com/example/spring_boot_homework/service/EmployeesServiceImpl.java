package com.example.spring_boot_homework.service;

import com.example.spring_boot_homework.dao.EmployeesRepo;
import com.example.spring_boot_homework.entity.Employees;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    private EmployeesRepo employeesRepo;

    public EmployeesServiceImpl(EmployeesRepo employeesRepo) {
        this.employeesRepo = employeesRepo;
    }

    @Override
    public List<Employees> getEmployees() {
        return employeesRepo.findAll();
    }

    @Override
    public Employees getEmployeesById(int id) {
        return employeesRepo.findById(id).get();
    }

    @Override
    public void addEmployees(Employees employees) {
        employeesRepo.save(employees);
    }

    @Override
    public void updateEmployees(Employees employees) {
        employeesRepo.save(employees);
    }

    @Override
    public void deleteEmployees(int id) {
        employeesRepo.deleteById(id);
    }
}
