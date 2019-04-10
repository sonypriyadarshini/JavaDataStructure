package array;
/* Check the repeated words in a file*/

// >>>>>> Incomplete
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileReader {

    public static void findRepeats() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new java.io.FileReader("sadf"));
        String line = bufferedReader.readLine();
        Set<String > set = new HashSet<>();

        while(line!=null){
            StringBuffer stringBuffer = new StringBuffer();
            String st[] = line.toLowerCase().split(" ");

            for(String s:st){
                if(set.contains(s))
                    System.out.println(s);
                set.add(s);
            }
            line=bufferedReader.readLine();
        }

    }
    public static void main(String args[]){

        int ar[]= {1,2};
        Arrays.asList(ar);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.toArray();

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        List<Integer> list = new ArrayList<>(hashMap.values());

    }
}
