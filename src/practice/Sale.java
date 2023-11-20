package practice;

public class Sale {
    double countDiscount(double orderPrice) {
        if (orderPrice <= 5000) {
            return orderPrice * 5 / 100;
        } else if (10000 >= orderPrice) {
            return orderPrice * 10 / 100;
        }
        return orderPrice * 15 / 100;
    }

    double priceWithDiscount(double orderPrice, double discount) {
        return orderPrice - discount;
    }
}
