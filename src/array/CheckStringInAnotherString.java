package array;

public class CheckStringInAnotherString {
    public static void main(String args[]){
        String s1 = "ab cd e";
        String s2 = "cd";
        checkString(s1,s2);
    }

    public static void checkString(String s1, String s2){

        int l1 = s1.length(), l2=s2.length();

        for(int i=0;i<l1-l2;i++){
            int j=0;
            for(j=0;j<l2;j++)
                if(s1.charAt(i+j)!=s2.charAt(j))
                    break;

            if(j==l2){
                System.out.println("yes, "+ s2+" is present at address location "+i);
                return;
            }
        }
        System.out.println("not present ");
    }
}
