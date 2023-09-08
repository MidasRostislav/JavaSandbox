package Buildings;

public class CheckBuildings {
    public static void buildingsCheck(){
        Library lib = new Library();
        System.out.println(lib.getType());
        System.out.println(lib.getName());
        System.out.println(lib.getArchitectName());
        System.out.println(lib.getAddress());
        System.out.println(lib.getYearOfBuilding());
        System.out.println(lib.isCulturalHeritage());
        lib.display();

        System.out.println();

        University uni = new University();
        System.out.println(uni.getType());
        System.out.println(uni.getName());
        System.out.println(uni.getArchitectName());
        System.out.println(uni.getAddress());
        System.out.println(uni.getYearOfBuilding());
        System.out.println(uni.isCulturalHeritage());
        uni.display();
        uni.holdAdministrationMeeting();
        uni.directorChange();
    }








}
