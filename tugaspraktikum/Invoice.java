package tugaspraktikum;

public class Invoice implements Payable {

    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return productName + " | jumlah: " + quantity +
               " | harga: " + pricePerItem +
               " | total: " + getPayableAmount();
    }
}