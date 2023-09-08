package Buildings;

public class University extends Building implements EducationalInstitution{

    private int teachersNumber, studentsNumber, capacity;
    private String name;


    public University() {
        super("Public university");
    }

    public University(String type, String address, String architectName, int yearOfBuilding, boolean isCulturalHeritage,
                      int teachersNumber, int studentsNumber, int capacity, String name) {
        super(type, address, architectName, yearOfBuilding, isCulturalHeritage);
        this.teachersNumber = teachersNumber;
        this.studentsNumber = studentsNumber;
        this.capacity = capacity;
        this.name = name;
    }


    public int getTeachersNumber() {
        return teachersNumber;
    }

    public void setTeachersNumber(int teachersNumber) {
        this.teachersNumber = teachersNumber;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
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

    public void directorChange(){
        System.out.println("Director successfully changed");
    }

    public void hiringNewEmployee(){
        System.out.println("New employee successfully hired");
    }

    @Override
    public void display(){
        System.out.println("There must be information about University object");
    }


}
