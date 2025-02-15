public class Car {
   private LicensePlate licensePlate;
   private String brand;
   private static int chassisNumber;

    Car( String brand ,LicensePlate  licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        chassisNumber++;

    }





    public LicensePlate getLicensePlate(){
        return  licensePlate;
    }

    public String getBrand(){
        return brand;
    }






}
