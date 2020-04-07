public class test1 {

    public static void main(String[] args) {
//        System.out.println(ispower(8));
//        System.out.println(countSetBits(7));

//        char []set = {'a', 'b', 'c'};
//        printPowerSet(set, 3);
//
//        int[] A = { 0, 1, 2, 6, 9, 11, 15 };
//
//        int left = 0, right = A.length - 1;
//        System.out.println("The smallest missing element is "
//                + smallestMissing(A, left, right));

//        reverseBits(11);
//        factorial();

//        MajorityElement majorelement = new MajorityElement();
        int a[] = new int[]{1, 1, 2, 3, 1};
        int size = a.length;
        printMajority(a, size);

    }

    static void printMajority(int a[], int size)
    {
        /* Find the candidate for Majority*/
        int cand =  findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if ( isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }

    /* Function to find the candidate for Majority */
    static int findCandidate(int a[], int size)
    {
        int maj_index = 0, count = 1;
        int i;
        for (i = 1; i < size; i++)
        {
            if (a[maj_index] == a[i])
                count++;
            else
                count--;
            if (count == 0)
            {
                maj_index = i;
                count = 1;
            }
        }
        return a[maj_index];
    }

    /* Function to check if the candidate occurs more
       than n/2 times */
    static boolean isMajority(int a[], int size, int cand)
    {
        int i, count = 0;
        for (i = 0; i < size; i++)
        {
            if (a[i] == cand)
                count++;
        }
        if (count > size / 2)
            return true;
        else
            return false;
    }




    static void findNumbers(int n){
        int res=n*5;
        for(int i=0;i<=4;i++)
            System.out.println(res+i);
    }

    static void factorial(){
        long res=1;

        for(int i=1;i<=100;i++){
            for(int j=1;j<=i;j++)
            {
                res=res*j;
            }
            System.out.println(" "+i+"  :  "+res);
        }
    }

    public static int reverseBits(int n)
    {
        int rev = 0;

        // traversing bits of 'n'
        // from the right
        while (n > 0)
        {
            // bitwise left shift
            // 'rev' by 1
            rev <<= 1;

            // if current bit is '1'
            if ((int)(n & 1) == 1)
                rev ^= 1;

            // bitwise right shift
            //'n' by 1
            n >>= 1;
        }
        // required number
        return rev;
    }



    static int findFloorSqrRoot(int num) {
        int res = 0;
        int start = 0, end = num ;
        while (start <= end) {
            int mid =( start + end) / 2;
            if ((mid * mid) <= num && res<(mid)){
                res = mid;
                start++;

            }
            else if (mid * mid > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return res;
    }


    static boolean ispower(int x) {

        return (x != 0 && (x & (x - 1)) == 0);
    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }

    public static int smallestMissing(int[] A, int left, int right) {
        // base condition
        if (left > right) {
            return left;
        }

        int mid = left + (right - left) / 2;

        // if mid index matches with its value, then the mismatch
        // lies on the right half
        if (A[mid] == mid) {
            return smallestMissing(A, mid + 1, right);
        } else {
            // mismatch lies on the left half
            return smallestMissing(A, left, mid - 1);
        }
    }


    static void printPowerSet(char[] set,
                              int set_size) {

        /*set_size of power set of a set
        with set_size n is (2**n -1)*/
        long pow_set_size =
                (long) Math.pow(2, set_size);
        int counter, j;

        /*Run from counter 000..0 to
        111..1*/
        for (counter = 0; counter <
                pow_set_size; counter++) {
            for (j = 0; j < set_size; j++) {
                /* Check if jth bit in the
                counter is set If set then
                print jth element from set */
//                System.out.print(1 << j);
//                System.out.println("        "+(counter & (1 << j)));
                if ((counter & (1 << j)) > 0)
                    System.out.print(set[j]);
            }

            System.out.println();
        }
    }

}
