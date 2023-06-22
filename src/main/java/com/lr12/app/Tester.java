package com.lr12.app;

public class Tester {
    private String name;
    private String surname;
    private int expirienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname)
    {
        this(name, surname, 0, "Beginner", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears)
    {
        this(name, surname, expirienceInYears, "Intermediate", 0.0);
    }

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printName()
    {
        System.out.println("Имя: " + name);
    }

    public void printName(String name, String surname)
    {
        System.out.println("Имя: " + name + "Фамилия: " + surname);
    }

    public void printSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void printExperience() {
        System.out.println("Опыт: " + expirienceInYears + " лет");
    }

    public static double calculateSalary(double baseSalary, int expirienceInYears)
    {
        double salary = baseSalary;
        if (expirienceInYears > 2)
        {
            salary *= 1.2;
        }
        if (expirienceInYears > 5)
        {
            salary *= 1.5;
        }
        return salary;
    }
    public static double calculateSalary(double baseSalary)
    {
        double salary = baseSalary;
        if (baseSalary > 2)
        {
            salary *= 2;
        }

        return salary;
    }

    public static double calculateSalary(String name, double baseSalary)
    {
        double salary = baseSalary;
        if (baseSalary > 2)
        {
            salary *= 1.2;
        }
        if (name == "Тима")
        {
            salary *= 1.5;
        }

        return salary;
    }
}
