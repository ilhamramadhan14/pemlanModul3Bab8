package tugaspraktikum;

public class Employee implements Payable {

    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int reg, String name, int salary, Invoice[] invoices) {
        this.registrationNumber = reg;
        this.name = name;
        this.salaryPerMonth = salary;
        this.invoices = invoices;
    }

    public double getTotalBelanja() {
        double total = 0;
        for (Invoice i : invoices) {
            total += i.getPayableAmount();
        }
        return total;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalBelanja();
    }

    public void display() {
        System.out.println("==============================");
        System.out.println("ID: " + registrationNumber);
        System.out.println("Nama: " + name);
        System.out.println("Gaji Awal: " + salaryPerMonth);
        System.out.println("\n----- Detail Belanja -----");
        for (Invoice i : invoices) {
            System.out.println(i);
        }
        System.out.println("==============================");
        System.out.println("\nTotal Belanja: " + getTotalBelanja());
        System.out.println("Gaji Setelah Potong: " + getPayableAmount());
        System.out.println("==============================");
        
    }
}