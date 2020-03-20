package testpakg.array;

public class numberodd {

       public static  int getOddOccurrence(int ar[], int ar_size)
        {
            int i;
            int res = ar[0];
            for (i = 1; i < ar_size; i++)
            {
                System.out.print(res+" xor "+ar[i]+" = ");
                res = res ^ ar[i];
                System.out.print(res);
                System.out.println();

            }
            return res;
        }

        public static void main(String[] args)
        {
            int ar[] = new int[]{3,7,2,3,2,1,3,1,7};
            int n = ar.length;
            System.out.println(getOddOccurrence(ar, n));
        }

}
