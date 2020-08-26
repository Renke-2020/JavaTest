package com.readingcsvinjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.*;



public class CsvReaderInjava {

    public static void main(String... args) {
        List<Employee1> employees = readEmployeesFromCSV("employees.csv");

        
        for (Employee1 emp : employees) {
            System.out.println(emp);
        }
    }

    private static List<Employee1> readEmployeesFromCSV(String fileName) {
        List<Employee1> employees = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

     
       
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {

            
            String line = br.readLine();
            
            
            List<Employee1>empWithDeptA00=employees.stream().filter(i->employee1.getDept()==A00).collectors.toList());
            System.out.println(empWithDeptA00);
            
            
            
            Iterator itr=employees.iterator();  
               while(itr.hasNext())
               {
                	if(((Employee1) itr.next()).getDept()=="A00")
                	{
                		System.out.println(itr.next());
                	}
                }
                

            
            while (line != null) {

               
  
                String[] attributes = line.split(",");

                Employee1 emp1 = createEmployee(attributes);

                
                employees.add(emp1);

                
              
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

     
        return new Employee1(name, hireDate, dept);
    }

}


