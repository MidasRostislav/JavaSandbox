public class Backwards {
    String s;

    Backwards(String str){
        s = str;
    }

    void backward(int i){
        if(i != s.length() - 1)
            backward(i + 1);
        System.out.print(s.charAt(i));
    }
}
