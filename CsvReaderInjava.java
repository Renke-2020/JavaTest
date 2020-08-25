package com.readingcsvinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CsvReaderInjava {

    public static void main(String... args) {
        List<Employee1> employees = readEmployeesFromCSV("employees.csv");

        // let's print all the person read from CSV file
        for (Employee1 emp : employees) {
            System.out.println(emp);
        }
    }

    private static List<Employee1> readEmployeesFromCSV(String fileName) {
        List<Employee1> employees = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Employee1 emp1 = createEmployee(attributes);

                // adding book into ArrayList
                employees.add(emp1);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return employees;
    }

    private static Employee1 createEmployee(String[] metadata) {
        String name = metadata[0];
        String hireDate = metadata[1];
        String dept = metadata[2];

        // create and return book of this metadata
        return new Employee1(name, hireDate, dept);
    }

}


