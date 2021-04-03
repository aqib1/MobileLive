package com.mobilelive.io;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @BeforeEach
    public void setUp() {
        employeeService = new EmployeeService();
    }

    @Test
    public void testGetListOfAgeWithNullList() {
        List<Integer> listOfAge = employeeService.getListOfAge(null);
        assertTrue(listOfAge.isEmpty());
    }

    @Test
    public void testGetListOfAgeWithEmptyList() {
        List<Integer> listOfAge = employeeService.getListOfAge(Arrays.asList());
        assertTrue(listOfAge.isEmpty());
    }

    @Test
    public void testGetListOfAgeGreaterThanOrEquals18() {
        List<Integer> listOfAge = employeeService.getListOfAge(Arrays.asList(
                new Employee(0, 18, "aqib"),
                new Employee(1, 19, "ali"),
                new Employee(2, 16, "ahmad")
        ));
        assertEquals(Arrays.asList(18, 19), listOfAge);
    }

    @Test
    public void testGetUniqueNamesWithNullList() {
        List<String> uniqueNames = employeeService.getUniqueNames(null);
        assertTrue(uniqueNames.isEmpty());
    }

    @Test
    public void testGetUniqueNamesWithEmptyList() {
        List<String> uniqueNames = employeeService.getUniqueNames(Arrays.asList());
        assertTrue(uniqueNames.isEmpty());
    }


    @Test
    public void testGetUniqueNames() {
        List<String> uniqueNames = employeeService.getUniqueNames(Arrays.asList(
                new Employee(0, 18, "aqib"),
                new Employee(1, 19, "ali"),
                new Employee(2, 16, "aqib")
        ));
        assertEquals(Arrays.asList("aqib", "ali"), uniqueNames);
    }
}
