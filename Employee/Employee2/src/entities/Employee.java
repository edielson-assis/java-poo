package entities;

public class Employee {
    
    private String name;
    private double grossSalary;
    private double tax;    

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }
    
    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTax(double tax) {
        this.tax = tax;
    } 

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return name + ", $ " + String.format("%.2f%n", netSalary());
    }    
}