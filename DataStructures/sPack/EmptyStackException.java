package DataStructures.sPack;

public class EmptyStackException extends Exception{
    EmptyStackException(){}

    @Override
    public String toString(){
        return "\nStack is empty";
    }
}
