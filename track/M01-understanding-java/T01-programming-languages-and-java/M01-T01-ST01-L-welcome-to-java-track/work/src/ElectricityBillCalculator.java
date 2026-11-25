public class ElectricityBillCalculator {
    public static void main(String[] args) {
        String name = "Rahul";
        int units = 350;
        double bill = 0;
        double surcharge = 0;
        double totalBill;

        if (units > 300) {
            bill = units * 7;
        } else if (units > 200) {
            bill = units * 5;
        } else if (units > 100) {
            bill = units * 3;
        } else if (units > 0) {
            bill = units * 2;
        } else {
            System.out.println("Invalid Units");
        }
        if (bill > 1000) {
            surcharge = bill * (5.0 / 100);
        }
        totalBill = bill + surcharge;

        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + units);
        System.out.println("Electricity Bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Total Bill: " + totalBill);
    }
}
