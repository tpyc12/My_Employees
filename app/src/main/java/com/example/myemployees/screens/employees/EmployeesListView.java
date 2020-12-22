package com.example.myemployees.screens.employees;

import com.example.myemployees.pojo.Employee;

import java.util.List;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
