package com.example.spring_boot_homework.service;

import com.example.spring_boot_homework.dao.EmployeesDAO;
import com.example.spring_boot_homework.entity.Employees;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    private EmployeesDAO employeesDAO;

    public EmployeesServiceImpl(EmployeesDAO employeesDAO) {
        this.employeesDAO = employeesDAO;
    }

    @Override
    @Transactional
    public List<Employees> getEmployees() {
        return employeesDAO.getEmployees();
    }

    @Override
    @Transactional
    public Employees getEmployeesById(int id) {
        Employees employees = employeesDAO.getEmployeesById(id);
        return employees;
    }

    @Override
    @Transactional
    public void addEmployees(Employees employees) {
        employeesDAO.addEmployees(employees);
    }

    @Override
    @Transactional
    public void updateEmployees(Employees employees) {
        employeesDAO.updateEmployees(employees);
    }

    @Override
    @Transactional
    public void deleteEmployees(int id) {
        Employees employees = employeesDAO.getEmployeesById(id);
        employeesDAO.deleteEmployees(id);
    }
}
