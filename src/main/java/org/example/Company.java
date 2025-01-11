package org.example;

// Yazılacak tüm sınıflardaki sınıf değişkenleri private olarak tanımlanmalı. Hepsi için getter & setter metodları yazılmalı.
// Her sınıfın toString() metodu ezilmeli. Her sınıf için en az bir tane constructor tanımlanmalı.

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = developerNames;

        if (giro < 0) {
            giro = 0;
        }

    }

    public void addEmployee(int index, String name) {

        if (index < 0 || index >= developerNames.length) {
            System.out.println("Error: Index out of bounds!");
            return;
        }

        if (developerNames[index] == null) {
            developerNames[index] = name;
            System.out.println("Dev name added at index " + index + ": " + name);
        } else {
            System.out.println("Error: Index " + index + " is already occupied with " + developerNames[index]);
        }
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }
}

