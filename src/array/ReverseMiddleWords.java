package array;

public class ReverseMiddleWords {

    public static void main(String args[]){
        reversemiddle();
    }

    public static void reversemiddle(){
        String s = "i am a disco dancer";
        String firstWord="", lastWord="";
        for(int i=0;i<s.length()&&s.charAt(i)!=' ';i++){
            firstWord = firstWord+s.charAt(i);
        }

        for(int j=s.length()-1;j>0&&s.charAt(j)!=' ';j--){
            lastWord=lastWord+s.charAt(j);
        }
        for(int k=lastWord.length()-1;k>0;k--)
            System.out.print(lastWord.charAt(k));


    }
}
