package Help;

import java.io.*;

public class FileHelp {
    private String helpFile;

    public FileHelp(String name){
        helpFile = name;
    }

    public String getSelection(){
        String topic = "";
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Write down topic you search information about:");
        try{
            topic = br.readLine();
        }
        catch (IOException exc){
            System.out.println("Error while console reading");
        }
        return topic;
    }

    public boolean helpon(String what){
        int ch;   //variable to read chars until #
        String topic, info;

        try(BufferedReader br = new BufferedReader(new FileReader(helpFile))){

            // Reading chars until #
            do{
                ch = br.read();
                if(ch == '#'){
                    topic = br.readLine();
                    if(topic.equals(what)){
                        //Reading lines under topic until empty line or EOF;
                        do{
                            info = br.readLine();
                            if(info != null)
                                System.out.println(info);
                        }while ( (info != null) && (!info.equals("")) );
                        return true; // If correct info about necessary topic was written return true
                    }
                }
            }while(ch != -1);
        }
        catch (IOException exc){
            System.out.println("Error while finding file with help information:   " + exc);
        }
        return false; //If topic not found
    }


}
