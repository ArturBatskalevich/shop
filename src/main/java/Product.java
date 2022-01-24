import java.util.StringJoiner;

public class Product {

    private String name;
    private String serialNumber;
    private Double price;
    private Integer amount;

    public Product(String name, String serialNumber, Double price, Integer amount) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.price = price;
        this.amount = amount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(name);

        if (price != null) sb.append(", price = ").append(price);
        if (amount != null) sb.append(", amount = ").append(amount);

        return sb.toString();
    }

    @Override
    public int hashCode() {
        return serialNumber.hashCode();
    }
}

