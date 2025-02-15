public class LicensePlate {
    private String regionalCode;
    private String letters;

    private int digits;

    LicensePlate(String regionalCode, String letters, int digits){
        this.regionalCode = regionalCode;
        this.letters = letters;
        this.digits = digits;
    }

    boolean isEqual(LicensePlate other){
        return this.regionalCode.equals(other.regionalCode) &&
                this.letters.equals(other.letters) &&
                this.digits == other.digits;
    }






    public String getRegionalCode() {
        return regionalCode;
    }

    public String getLetters() {
        return letters;
    }

    public int getDigits() {
        return this.digits;
    }


}
