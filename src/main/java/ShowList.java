import java.util.List;

public class ShowList {

    public static void showListProducts(List<Product> list) {          //DRY
        System.out.println("Список доступных товаров:");
        int n = 1;
        for (Product products : list) {
            System.out.println(n + ". " + products);
            n++;
        }
    }

    public static void showListBasket(List<Product> list) {
        System.out.println("Твоя корзина:");
        int n = 1;
        for (Product products : list) {
            System.out.println(n + ". " + products.getName());
            n++;
        }
    }

    public static void showTotalCost(Double cost) {
        System.out.println("Общая сумма: " + Main.totalCost + " р.");

    }
}
