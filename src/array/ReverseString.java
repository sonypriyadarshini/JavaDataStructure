package array;

public class ReverseString {
    public static void main(String[] args){
        reverseString();
        reverseStringRec("abcde");
    }

    public static void reverseString(){
        String str="abcde";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void reverseStringRec(String string){
        String str=string;
        int l = str.length();
        if(l<=0||str==null)
            return;
        else{
            System.out.println(str.charAt(l-1));
            reverseStringRec(str.substring(0,l-1));}

    }
}
