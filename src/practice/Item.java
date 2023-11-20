package practice;

public class Item {
    double[] Items = new double[]{4999, 2310, 1210, 999, 9999};

    void printMenu() {
        System.out.println("  Items shop ");
        System.out.println("----------------");
        System.out.printf("1.Item1 - %.2f\n2.Item2 - %.2f\n3.Item3 - %.2f\n4.Item4 - %.2f\n5.Item5 - %.2f\n",
                Items[0], Items[1], Items[2], Items[3], Items[4]);
        System.out.println("----------------");
    }
}
