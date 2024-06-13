package com.example.technomakers.springbatch.exercice.config;

import com.example.technomakers.springbatch.exercice.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        if (employee.getSalary() < 60000) {
            employee.setSalary(employee.getSalary() + 1000);
        }
        return employee;
    }
}
