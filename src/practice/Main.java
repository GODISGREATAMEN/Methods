package practice;

public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        Sale sale = new Sale();

        item.printMenu();
        double totalPrice = order.makeOrder();
        double discount = sale.countDiscount(totalPrice);
        double priceWithSale = sale.priceWithDiscount(totalPrice, discount);
        order.orderInfo(totalPrice, discount, priceWithSale);
    }
}