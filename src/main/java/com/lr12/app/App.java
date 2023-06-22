package com.lr12.app;

import static com.lr12.app.Tester.calculateSalary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello ДАНИЛА!" );

        Tester tester = new Tester("Данила", "Шевчик");
        double baseSalary = 500.0;
        int expirienceInYears = 1;
        double salary = calculateSalary(baseSalary, expirienceInYears);
        tester.printName();
        tester.printSurname();
        System.out.println("Зарплата: " + salary);
    }
}
