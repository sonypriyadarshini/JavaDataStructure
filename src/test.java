import java.util.Iterator;
import java.util.LinkedList;

public class test {

    public static void main(String[] args) {
        int a[]={1,1,2,2,2,3,3,3,3};
        int o[]=new int[a.length];
        o[0]=a[0];
        int j=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                a[i]=-1;

            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=-1)
                System.out.println(a[i]);
        }

        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(5);
        linkedList1.add(6);
        System.out.println(linkedList1);

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(4);
        linkedList2.add(3);
        linkedList2.add(5);
        linkedList2.add(6);

        int l1 = linkedList1.size();
        int l2 = linkedList2.size();
        int d = 0;
        if (l1 > l2) {
            d = l1 - l2;

        }
        Iterator<Integer> iterator = linkedList1.listIterator();
        Iterator<Integer> iterator2 = linkedList2.listIterator();
        while (d > 0) {
            iterator.next();
            d--;

        }
        while (l2 > 0) {
            int i1=iterator.next();
            if (i1 == iterator2.next()) {
                System.out.println("found: "+i1);
                break;
            }
            l2--;
        }

        // 10*2-8/4
    }
}
