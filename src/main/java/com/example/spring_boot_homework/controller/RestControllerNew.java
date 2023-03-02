package com.example.spring_boot_homework.controller;

import com.example.spring_boot_homework.entity.Employees;
import org.springframework.web.bind.annotation.*;
import com.example.spring_boot_homework.service.EmployeesService;

import java.util.List;

@RestController
@RequestMapping("skypro")
public class RestControllerNew {
    private EmployeesService employeesService;

    public RestControllerNew(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }
    @GetMapping("/employees")
    public List<Employees> getEmployees() {
        return employeesService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employees getPersonById(@PathVariable int id) {
        return employeesService.getEmployeesById(id);
    }

    @PostMapping("/employees")
    public Employees addEmployees(@RequestBody Employees employees) {

        employeesService.addEmployees(employees);
        return employees;

    }

    @PutMapping("/employees")
    public Employees updateEmployees(@RequestBody Employees employees) {

        employeesService.updateEmployees(employees);
        return employees;

    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployees(@PathVariable int id) {

        employeesService.deleteEmployees(id);
        return "Employees with id = " + id + " was deleted";

    }
}
