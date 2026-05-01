package tugaspraktikum;

public class Main {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("Beras", 2, 50000);
        Invoice i2 = new Invoice("Minyak", 1, 20000);
        Invoice i3 = new Invoice("Gula", 3, 15000);
        Invoice[] daftarBelanja = {i1, i2, i3};

        Employee e = new Employee(777, "Kicaw", 3000000, daftarBelanja);
        e.display();
    }
}