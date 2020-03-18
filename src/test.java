import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class test {


    static int powertest(int a,int b){
        if(b==1)
            return a;
        return a*powertest(a,b-1);
    }



    static void incrementVector(Vector<Integer> a)
    {
        int n = a.size();
        int sum=0,carry=1;

        while(n>0){
             sum=a.get(n-1)+carry;
             carry=sum>=10?1:0;
             sum=sum%10;
             a.set(n-1,sum);
             n--;
        }

        if(carry>0)
            a.add(0,carry);


        // Add 1 to last digit and find carry
//        a.set(n - 1, a.get(n - 1) + 1);
//        int carry = a.get(n - 1) / 10;
//        a.set(n - 1, a.get(n - 1) % 10);
//
//        // Traverse from second last digit
//        for (int i = n - 2; i >= 0; i--)
//        {
//            if (carry == 1)
//            {
//                a.set(i, a.get(i) + 1);
//                carry = a.get(i) / 10;
//                a.set(i, a.get(i) % 10);
//            }
//        }
//
//        // If carry is 1, we need to add
//        // a 1 at the beginning of vector
//        if (carry == 1)
//            a.add(0, 1);
    }

    // Driver code
    public static void main (String[] args)
    {

        final int h;
        h=50;

        float ff=2.30f;

        System.out.println(h);

//        System.out.println(powertest(3,3));
//
//
//        Vector<Integer> vect=new Vector<Integer>();
//        vect.add(2);
//        vect.add(9);
//        vect.add(9);
//        vect.add(9);
////
//        incrementVector(vect);
////
//        for (int i = 0; i < vect.size(); i++)
//            System.out.print(vect.get(i) + " ");
////    }
//
//    public static void main(String[] args) {
//
////        int s=0;
////        System.out.println(printsum(123,s ));
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        ArrayList<Integer> a=new ArrayList<>();
//        System.out.println(a.size());
//
//        int ar[]={};
//        System.out.println(ar.length);
//
//        String s="prdsf";
//        s=s+"dsff";
//

//        int a[]={1,1,2,2,2,3,3,3,3};
//        int o[]=new int[a.length];
//        o[0]=a[0];
//        int j=1;
//        for(int i=0;i<a.length-1;i++){
//            if(a[i]==a[i+1]){
//                a[i]=-1;
//
//            }
//        }
//        for(int i=0;i<a.length;i++){
//            if(a[i]!=-1)
//                System.out.println(a[i]);
//        }
//
//        LinkedList<Integer> linkedList1 = new LinkedList<>();
//        linkedList1.add(1);
//        linkedList1.add(2);
//        linkedList1.add(3);
//        linkedList1.add(5);
//        linkedList1.add(6);
//        System.out.println(linkedList1);
//
//        LinkedList<Integer> linkedList2 = new LinkedList<>();
//        linkedList2.add(4);
//        linkedList2.add(3);
//        linkedList2.add(5);
//        linkedList2.add(6);
//
//        int l1 = linkedList1.size();
//        int l2 = linkedList2.size();
//        int d = 0;
//        if (l1 > l2) {
//            d = l1 - l2;
//
//        }
//        Iterator<Integer> iterator = linkedList1.listIterator();
//        Iterator<Integer> iterator2 = linkedList2.listIterator();
//        while (d > 0) {
//            iterator.next();
//            d--;
//
//        }
//        while (l2 > 0) {
//            int i1=iterator.next();
//            if (i1 == iterator2.next()) {
//                System.out.println("found: "+i1);
//                break;
//            }
//            l2--;
//        }

        // 10*2-8/4
    }

   static int printsum(int n, int sum){
        if(n==0)
            return sum;
        sum+=n%10;
       return printsum(n/10,sum);
    }
}
