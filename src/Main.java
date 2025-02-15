// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LicensePlate licensePlate = new LicensePlate("M", "A",14);
        LicensePlate licensePlate1 = new LicensePlate("M","A", 14);

        System.out.println(licensePlate.isEqual(licensePlate1));

        Car car = new Car("Ferrari", licensePlate);
        CarPark carPark = new CarPark(4);







    }
}