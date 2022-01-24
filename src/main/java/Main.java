import java.util.*;

public class Main {

    public static List<Product> listProducts = new ArrayList<>();
    public static List<Product> listBasket = new ArrayList<>();
    public static final String promoCode = "netology";
    public static final String discountPercentage = "15%";  //Magics (Избегание магических чисел)
    public static final Double discount = 0.15;
    public static Double totalCost = 0.0;
    public static Scanner scanner = new Scanner(System.in);
    public static PurchaseProducts purchaseProducts = new PurchaseProducts();


    public static void main(String[] args) {

        Product milk = new ProductBuilder()                      //Open Closed Principle
                .setName("Молоко")
                .setSerialNumber("45613456")
                .setPrice(1.9)
                .setAmount(10)
                .build();

        Product bread = new ProductBuilder()
                .setName("Хлеб")
                .setSerialNumber("13a123")
                .setPrice(1.5)
                .setAmount(20)
                .build();

        Product butter = new ProductBuilder()
                .setName("Масло")
                .setSerialNumber("111fh234")
                .setPrice(3.9)
                .setAmount(4)
                .build();

        Product onions = new ProductBuilder()
                .setName("Лук")
                .setSerialNumber("1876543")
                .setPrice(2.1)
                .setAmount(10)
                .build();

        listProducts.addAll(Arrays.asList(bread, butter, onions, milk));
        purchaseProducts.buy(listProducts);
        getPrise();
    }



    public static void getPrise() {                            //Single Responsibility Principle
        System.out.println("Ввведите Промокод:");
        String word = scanner.nextLine();
        if (word.equals(promoCode)){
            ShowList.showListBasket(listBasket);
            System.out.println("Вы получили скидку " + discountPercentage);
            ShowList.showTotalCost(totalCost * discount);

        } else {
            ShowList.showListBasket(listBasket);
            System.out.println("У вас нет скидки");
            ShowList.showTotalCost(totalCost);
        }

    }
}
