package Buildings;

public abstract class Building {
    final static String description = "This abstract class contains information about buildings:" +
                                      "\n type of building, address, architect name, year of building," +
                                      "\nis building has Cultural Heritage status\n";
    private String type, address, architectName;
    private int yearOfBuilding;
    private boolean isCulturalHeritage;

    {
        setType("Default");
        setAddress("Nowhere");
        setArchitectName("No architect");
    }

    public Building(String type){
        this.type = type;
    }

    public Building(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public Building(String type, String address, String architectName) {
        this.type = type;
        this.address = address;
        this.architectName = architectName;
    }

    public Building(String type, String address, String architectName, int yearOfBuilding) {
        this.type = type;
        this.address = address;
        this.architectName = architectName;
        this.yearOfBuilding = yearOfBuilding;
    }

    protected Building(String type, String address, String architectName, int yearOfBuilding, boolean isCulturalHeritage) {
        this.type = type;
        this.address = address;
        this.architectName = architectName;
        this.yearOfBuilding = yearOfBuilding;
        this.isCulturalHeritage = isCulturalHeritage;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArchitectName() {
        return architectName;
    }

    public void setArchitectName(String architectName) {
        this.architectName = architectName;
    }

    public int getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(int yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public boolean isCulturalHeritage() {
        return isCulturalHeritage;
    }

    public void setCulturalHeritage(boolean culturalHeritage) {
        isCulturalHeritage = culturalHeritage;
    }

    abstract void display();


}
