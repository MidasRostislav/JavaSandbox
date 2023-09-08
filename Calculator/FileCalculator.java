package Calculator;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileCalculator {

    private final ArrayList<String> lines = new ArrayList<>();
    private final ArrayList<String> results = new ArrayList<>();
    private String inputFileName, outputFileName;

    //Constructors
    public FileCalculator(String inputFileName, String outputFileName){
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    //Get&Set Methods
    public String getInputFileName() {
        return inputFileName;
    }

    public void setInputFileName(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    public String getOutputFileName() {
        return outputFileName;
    }

    public void setOutputFileName(String outputFileName) {
        this.outputFileName = outputFileName;
    }

    //Methods
    public void calculate()
    throws IOException{
        readingInput();
        solving();
        writingOutput();
    }

    protected void readingInput(){
        try(Scanner sc = new Scanner(new FileInputStream(inputFileName))){
            while(sc.hasNextLine()){
                String str = sc.nextLine();
                if(str.split(" ").length == 3)
                    lines.add(str);
            }
        }
        catch(IOException exc){
            System.out.println(exc);
        }

    }

    protected void solving(){

        for (String line : lines) {
            String[] str = line.split(" ");
            double a, b;
            if (isNumbers(str[0], str[2])) {
                a = Double.parseDouble(str[0]);
                b = Double.parseDouble(str[2]);
                switch (str[1]) {
                    case "+" -> results.add(Double.toString(a + b));
                    case "-" -> results.add(Double.toString(a - b));
                    case "*" -> results.add(Double.toString(a * b));
                    case "/" -> results.add(b == 0 ? "Error! Division by zero" : Double.toString(a / b));
                    default -> results.add("Operation Error!");
                }
            } else
                results.add("Error! Not number");
        }
    }

    protected void writingOutput(){
        try(FileWriter fw = new FileWriter(outputFileName)){
            for(int i = 0; i < lines.size(); i++){
                //System.out.println(lines.get(i) + " = " + results.get(i));
                fw.write(lines.get(i) + " = " + results.get(i) + "\n");
            }
        }
        catch (IOException exc){
            System.out.println(exc);
        }

    }

    protected boolean isNumbers(String first, String second){
        double a,b;
        try {
            a = Double.parseDouble(first);
            b = Double.parseDouble(second);
            return true;
        }
        catch (NumberFormatException exc){
            return false;
        }
    }


    //Methods for debuging

    public void showInput(){
        for(String str : lines){
            System.out.println(str);
        }
    }
    public void showResults(){
        for(String str : results){
            System.out.println(str);
        }
    }

}
