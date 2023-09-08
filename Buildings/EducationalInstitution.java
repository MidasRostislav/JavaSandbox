package Buildings;

public interface EducationalInstitution {

    void directorChange();

    void hiringNewEmployee();

    default void holdAdministrationMeeting(){
        System.out.println("Administration meeting provided successfully");
    }

    default void renovationMoneyCollecting(){
        System.out.println("Money for renovation collected successfully");
    }
}
