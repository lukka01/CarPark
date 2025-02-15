public class CarPark {

    Car[] spaces;


    public CarPark(int n) {
        this.spaces = new Car[n];
    }

    public int park(Car c) {
        for ( int  i = 0 ; i < spaces.length; i ++) {
            if (spaces[i] == null) {
                spaces[i] = c;
                return i;
            }
        }
        return  -1;
    }

    public int search(LicensePlate lp){
        for (int i = 0 ; i < spaces.length; i++) {
            if (spaces[i] != null && spaces[i].getLicensePlate().isEqual(lp)){
                return i;
            }
        }
        return -1;
    }
    public Car driveOff(LicensePlate lp){
        int k = search(lp);
        for (int i = 0; i < spaces.length; i++) {
            if (k != -1) {
                Car car = spaces[k];
                spaces[k] = null;

                return car;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Car Park:\n");
        for (int i = 0; i < spaces.length; i++) {
            builder.append(i + ": [");
            if (spaces[i] != null) {
                builder.append(spaces[i]);
            }
            builder.append("]\n");
        }
        return builder.toString();
    }

    public Car[] getSpaces() {
        return spaces;
    }















}
