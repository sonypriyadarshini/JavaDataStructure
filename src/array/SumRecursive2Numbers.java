package array;

public class SumRecursive2Numbers {

    public static void main(String args[]) {
        System.out.println(sumRec2Number(22,10));
    }

    public static int sumRec2Number(int a,int b){
        if(b==0){
            return a;
        }
        return 1+ sumRec2Number(a,b-1);
    }

}
