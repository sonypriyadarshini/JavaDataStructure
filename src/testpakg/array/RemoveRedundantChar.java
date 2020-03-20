package testpakg.array;

public class RemoveRedundantChar {
    public static void main(String args[]){
        String a = "asd@#$%^&*";
        a=a.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(a);
    }
}
