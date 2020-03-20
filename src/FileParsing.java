import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class FileParsing {
    public static void main(String[] args)throws Exception
    {
        File file = new File("/Users/sonypriyadarshini/Downloads/input.txt");
        Scanner scanner = new Scanner(file);
        Map<String,ArrayList<String>> entries=new HashMap<>();
        while(scanner.hasNext()){
            String line= scanner.nextLine();
            // if its a json object, put in map key 'json'
            if(!line.isEmpty() && line.startsWith("{")  ){
                processEntry(entries, "json", line);
            }
            // if its an string, put in map key 'strings'
            else if( !line.isEmpty() && line.matches("^[a-zA-Z]*$")){
                processEntry(entries, "strings", line);
            }
            // if its a float, put in map key 'floats'
            else if( !line.isEmpty() && line.matches("^[0-9]*\\.[0-9]*")){
                processEntry(entries, "floats", line);
            }
            // if its an integer, put in map key 'integers'
            else if( !line.isEmpty() && line.matches("^[0-9]*$")){
                processEntry(entries, "integers", line);
            }
            // if its an array, put in map key 'arrays'
            else if( !line.isEmpty() && line.startsWith("[")){
                processEntry(entries, "arrays", line);
            }
        }
        //printing the map values by grouping them
        for(Map.Entry<String, ArrayList<String>> entry : entries.entrySet()) {
            System.out.println("******  "+entry.getKey().toUpperCase()+"  ******");
            ArrayList<String> values = entry.getValue();
            for(String str : values) {
                System.out.println(str);
            }
        }

    }

    public static void processEntry(Map<String, ArrayList<String>> entries, String str, String line) {
        ArrayList<String> temp = new ArrayList<>();
        if(entries.containsKey(str)) {
            temp = entries.get(str);
            temp.add(line);
            entries.put(str, temp);
        }
        else {
            temp.add(line);
            entries.put(str, temp);
        }
    }
}