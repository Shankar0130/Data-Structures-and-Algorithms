package Array.TCSExplore;

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    public TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {

    }

    public void setregNo(int regNo) {
        this.regNo = regNo;
    }

    public void setagencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setpackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void setflightFacility(boolean flightFacility) {
        this.flightFacility = flightFacility;
    }

    public int getregNo() {
        return regNo;
    }

    public String getagencyName() {
        return agencyName;
    }

    public String getpackageType() {
        return packageType;
    }

    public int getprice() {
        return price;
    }

    public boolean getflightFacility() {
        return flightFacility;
    }

}