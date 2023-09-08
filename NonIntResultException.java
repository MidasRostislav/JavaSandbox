public class NonIntResultException  extends Exception{
    private int n, d;

    NonIntResultException(int i, int j){
        n = i;
        d = j;
    }

    @Override
    public String toString(){
        return "Resul of the operation " + n + "/" + d + " is not even number";
    }
}
