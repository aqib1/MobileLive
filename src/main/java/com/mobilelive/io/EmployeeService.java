package com.mobilelive.io;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class EmployeeService {
    private static final int AGE_LIMIT = 18;

    /**
     * Time complexity O(N)
     *
     * @param employees
     * @return
     */
    public List<Integer> getListOfAge(List<Employee> employees) {
        if(Objects.isNull(employees) || employees.isEmpty()) {
            return Arrays.asList();
        }
        return employees.stream()
                .filter(this::ageValidation)
                .map(Employee::getAge)
                .collect(Collectors.toList());
    }

    /**
     * Time complexity O(N)
     * @param employees
     * @return
     */
    public List<String> getUniqueNames(List<Employee> employees) {
        if(Objects.isNull(employees) || employees.isEmpty()) {
            return Arrays.asList();
        }
        return employees.stream()
                .map(Employee::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    private boolean ageValidation(Employee employee) {
        return employee.getAge() >= AGE_LIMIT;
    }
}
