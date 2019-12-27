package crackingTheCodingInterview.chapter1_Arrays;

/*
1.6 String Compression: Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become a2blc5a3, If the
"compressed" string would not become smaller than the original string, your method should return
the original string. You can assume the string has only uppercase and lowercase letters (a - z).

 */
public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compressedString("aabbba".toLowerCase()));
    }

    static String compressedString(String s){
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==s.length()-1){
                sb.append(s.charAt(i)+""+count);
                break;
            }
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i)+""+count);
                count=1;
            }
        }
        return sb.toString();
    }
}
