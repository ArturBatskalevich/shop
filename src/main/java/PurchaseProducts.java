import java.util.List;
import java.util.Scanner;

public class PurchaseProducts implements Purchase {

    @Override
    public void buy(List<Product> list) {



        while (true) {

            System.out.println("Желаете что нибудь приобрести(yes) или Выйти(no)");
            String input = Main.scanner.nextLine();

            if (input.equals("no")){
                return;
            } else if (input.equals("yes")) {
                System.out.println("Введите номер товара и его количество");
                ShowList.showListProducts(list);
                try {
                    String input2 = Main.scanner.nextLine();
                    String[] parts = input2.split(" ");
                    int productNumber = Integer.parseInt(parts[0]) - 1;
                    int productCount = Integer.parseInt(parts[1]);

                    Main.listBasket.add(list.get(productNumber));
                    list.get(productNumber).setAmount(list.get(productNumber).getAmount() - productCount);
                    Main.totalCost = Main.totalCost + (list.get(productNumber)).getPrice() * productCount;
                } catch (Exception e){
                    System.out.println("Не верные значения");
                }
            } else {
                System.out.println("Некорректный ввод");
            }
        }
    }
}
