package Buildings;

import java.util.List;

public class Library extends Building{

    private int booksNumber, capacity;
    private String name;

    {
        name = "No name";
    }

    //Constructors
    public Library(){
        super("Library");
    }

    public Library(String type, String address, int booksNumber, int capacity, String name) {
        super(type, address);
        this.booksNumber = booksNumber;
        this.capacity = capacity;
        this.name = name;
    }

    public Library(String type, String address, String architectName, int booksNumber, int capacity, String name) {
        super(type, address, architectName);
        this.booksNumber = booksNumber;
        this.capacity = capacity;
        this.name = name;
    }

    public Library(String type, String address, String architectName, int yearOfBuilding,
                   int booksNumber, int capacity, String name) {
        super(type, address, architectName, yearOfBuilding);
        this.booksNumber = booksNumber;
        this.capacity = capacity;
        this.name = name;
    }

    public Library(String type, String address, String architectName, int yearOfBuilding, boolean isCulturalHeritage,
                   int booksNumber, int capacity, String name) {
        super(type, address, architectName, yearOfBuilding, isCulturalHeritage);
        this.booksNumber = booksNumber;
        this.capacity = capacity;
        this.name = name;
    }

    //Get&Set Methods
    public int getBooksNumber() {
        return booksNumber;
    }

    public void setBooksNumber(int booksNumber) {
        this.booksNumber = booksNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void display() {
        System.out.println("There must be information about Library object");
    }
}
