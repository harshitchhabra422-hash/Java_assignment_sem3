public class Product {
    private String Code;
    private String Name;
    private double UnitPrice;
    private int Quantity;
    private static int ProductCount = 0;

    public Product(String code, String name, double unitPrice, int quantity) {
        this.Code = code;
        this.Name = name;
        this.UnitPrice = unitPrice;
        this.Quantity = quantity;
        ProductCount++;
    }
    public String getCode() {
        return Code;
    }
    public String getName() {
        return Name;
    }
    public double getUnitPrice() {
        return UnitPrice;
    }
    public int getQuantity() {
        return Quantity;
    }
    public static int getProductCount() {
        return ProductCount;
    }
    public void SetQuantity(int quantity) {
        this.Quantity = quantity;
    }
    public Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
        ProductCount++;
    }
    public void restock(int quantity) {
        this.Quantity += quantity;
    }
    public void sell(int quantity) {
        if (quantity <= this.Quantity) {
            this.Quantity -= quantity;
        } else {
            System.out.println("Not enough stock to sell " + quantity + " units.");
        }
    }
    public double getInventoryValue() {
        return this.UnitPrice * this.Quantity;
    }
    public String toString() {
        return "Product Code: " + this.Code + ", Name: " + this.Name + ", Unit Price: " + this.UnitPrice + ", Quantity: " + this.Quantity;
    }
}
