public class Animal {

    final static String description = "This class contains information about animals:" +
                                "\nnumber in counting system, type, name, age, weight," +
                                "\nis animal could fly/walk/swim\n";
    static int animalNumber = 1;
    private String type, name;
    private int age, number;
    private double weight;
    private boolean isFly, isWalk, isSwim;

    // Constructors
    Animal(String type, String name){
        this.type = type;
        this.name = name;
        number = animalNumber;
        animalNumber++;
    }

    Animal(String type, int age){
        this.type = type;
        this.age = age;
        this.name = "No Name";
        number = animalNumber;
        animalNumber++;
    }

    Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim){
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        number = animalNumber;
        animalNumber++;
    }

    // Get and Set methods

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    // Other methods

    void display(){
        System.out.println("Type: " + type + " Name: " + name + "\n" +
                           "Age: " + age + " Weight: " + weight + "\n" +
                           "isFly: " + (isFly ? "Yes" : "No") + " isWalk: " + (isWalk ? "Yes" : "No") +
                           " isSwim: " + (isSwim ? "Yes" : "No"));
        System.out.println();
    }

    @Override
    public String toString(){
        return "Number in counting system: " + number + " Type: " + type + " Name: " + name + "\n" +
                "Age: " + age + " Weight: " + weight + "\n" +
                "isFly: " + (isFly ? "Yes" : "No") + " isWalk: " + (isWalk ? "Yes" : "No") +
                " isSwim: " + (isSwim ? "Yes" : "No");
    }

    final void rename(String newName){
        name = newName;
    }

    void holiday(){
        weight += (double) 0.1;
    }

    void holiday(double m){
        weight += m;
    }

    void holiday(double m, int n){
        weight += n * m;
    }
}
