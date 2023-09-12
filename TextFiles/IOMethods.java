package TextFiles;

import java.io.*;

public class IOMethods {


    public void copyReplaceSpaces(String srcFile, String targetFile){
        int ch;

        try(FileReader fr = new FileReader(srcFile);
            FileWriter fw = new FileWriter(targetFile)){

            do{
                ch = fr.read();
                if(ch != -1)
                    fw.write(ch == ' ' ? '-' : ch);
            }while (ch != -1);

        }
        catch (IOException exc){
            System.out.println(exc);
        }

    }

    public static void AvgNums()
        throws IOException{
        String str;
        int n;
        double sum = 0.0, avg, d;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many numbers you want to input?   ");
        str = br.readLine();

        try {
            n = Integer.parseInt(str);
        }
        catch (NumberFormatException exc){
            System.out.println("Incorrect format, exception:   " + exc);
            return;
        }

        System.out.println("Write " + n + " lines with numbers");
        for(int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try{
                d = Double.parseDouble(str);
            }
            catch (NumberFormatException exc){
                System.out.println("Incorrect number format exception:   " + exc);
                return;
            }
            sum += d;
        }
        avg = sum / n;

        System.out.println("Average number is: " + avg);


    }


    public static void KtoD()
        throws IOException{
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Line 'stop' eds input");

        try(FileWriter fw = new FileWriter("TextFiles/Text.txt")){
            do{
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0)
                    break;
                str += "\r\n";
                fw.write(str);
            }while (str.compareTo("stop") != 0);
        }
        catch (IOException exc){
            System.out.println("IO exception:   " + exc);
        }

    }


    public static void PrintWriterDemo()
        throws IOException{
        PrintWriter pw = new PrintWriter(System.out, true);

        int i = 18;
        double d = 123.456;

        pw.println("PrintWriter class usage");
        pw.println(i);
        pw.println(d);
        pw.println("i + d = " + (i + d));

    }

    public static void  ReadLines()
    throws IOException{

        String str;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write some lines, line 'stop' will end input");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));


    }


    public static void ReadChars()
    throws IOException{

        char ch;
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write some symbols, symbol . will end input");

        do{
            ch = (char) br.read();
            System.out.println(ch);
        }while (ch != '.');



    }

    public static void CopmFilesIngnoreCase()
    throws IOException{
        String i, j;
        int counter = 0;

        try(BufferedReader br1 = new BufferedReader(new
                FileReader("TextFiles/Text.txt"));
            BufferedReader br2 = new BufferedReader(new
                    FileReader("TextFiles/TextCopy.txt"))){
            do{
                i = br1.readLine();
                j = br2.readLine();
                System.out.println("i has value:   " + i + "\n" +
                        "j has value:   " + j);
                if(i == null | j == null )
                    break;
                counter++;
            }while (i.equalsIgnoreCase(j));

            if(i == null && j == null)
                System.out.println("Files have the same content");
            else
                System.out.println("Files have different content, first different elements are in " + counter + " line");
        }
        catch (IOException exc){
            System.out.println("Input-Output error:   " + exc);
        }

    }


    public static void CompFiles(String firstFile, String secondFile)
    throws IOException{
        int i = 0, j = 0;
        int counter = 0;

        try(FileInputStream f1 = new FileInputStream(firstFile);
            FileInputStream f2 = new FileInputStream(secondFile)){
            do{
                i = f1.read();
                j = f2.read();
                if(i != j)
                    break;
                counter++;
            }while (i != -1);

            if(i == j)
                System.out.println("Files have the same content");
            else
                System.out.println("Files have different content, first different elements are in " + counter + " position");
        }
        catch (IOException exc){
            System.out.println("Input-Output error:   " + exc);
        }

    }


    public static void RWData()
            throws IOException {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("TextFiles/TData.txt"))) {
            System.out.println(i + "   was written down");
            dataOut.writeInt(i);

            System.out.println(d + "   was written down");
            dataOut.writeDouble(d);

            System.out.println(b + "   was written down");
            dataOut.writeBoolean(b);

            System.out.println(12.2 * 7.4 + "   was written down");
            dataOut.writeDouble(12.2 * 7.4);
        }
        catch (IOException exc){
            System.out.println("Error while input");
            return;
        }

        System.out.println();

        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("TextFiles/TData.txt"))){
            i = dataIn.readInt();
            System.out.println(i + "   was read");

            d = dataIn.readDouble();
            System.out.println(d + "   was read");

            b = dataIn.readBoolean();
            System.out.println(b + "   was read");

            d = dataIn.readDouble();
            System.out.println(d + "   was read");
        }
        catch (IOException exc){
            System.out.println("Error while reading information from file");
        }


    }

    public static void CopyFile(String sourceFile, String targetFile)
            throws IOException{
        int i;

        try(FileInputStream fin = new FileInputStream(sourceFile);
            FileOutputStream fout = new FileOutputStream(targetFile, true)) {
            do {
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.print("Input-output exception: " + exc);
        }



    }

    public static void IO_2()
            throws IOException{
        int i;
        FileInputStream fin = null;

        //Opening and reading file
        try {
            fin = new FileInputStream("Text.txt");
            do{
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            }
            while (i != -1);
        }
        catch (IOException exc){
            System.out.println("Input-output exception: " + exc);
        }

        //Closing file
        finally {
            try {
                if(fin != null)
                    fin.close();
            }
            catch (IOException exc){
                System.out.print("Error while closing the file");
            }
        }


    }



    public static void IO_1()
            throws IOException{
        byte[] data = new byte[10];

        System.out.println("Write some symbols:");
        System.in.read(data);
        System.out.println("You have written:");
        for(byte i : data)
            System.out.print((char)i);

        char b = 'X';
        System.out.write(b);
        //System.out.write('\n');
    }
}
