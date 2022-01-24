public class ProductBuilder {

    private String name;
    private String serialNumber;
    private Double price;
    private Integer amount;

    public ProductBuilder setName(String name){
        this.name = name;
        return this;
    }

    public ProductBuilder setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
        return this;
    }

    public ProductBuilder setPrice(Double price){
        this.price = price;
        return this;
    }

    public ProductBuilder setAmount(Integer amount){
        this.amount = amount;
        return this;
    }

    public Product build() {

        if (name == null || serialNumber == null) {
            throw new IllegalArgumentException("Not name or serial number");
        }
        return new Product(name, serialNumber,price,amount);
    }






}
