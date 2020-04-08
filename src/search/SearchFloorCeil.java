package search;

public class SearchFloorCeil {

    public static void getFloorCeil(int[] A, int x)
    {
        // search space is A[left..right]
        int left = 0, right = A.length - 1;

        // initialize ceil to -1
        int ceil = -1;
        int floor=-1;

        // iterate till search space contains at-least one element
        while (left <= right)
        {
            // find the mid value in the search space
            int mid = (left + right) / 2;

            // if x is equal to mid element, it is the ceil
            if (A[mid] == x) {
                System.out.print("Number " + x + " -> ");
                System.out.println("ceiling is " + A[mid]
                        + ", floor is " + A[mid]);
                return ;
            }

            // if x is less than the mid element, ceil exists in the
            // sub-array A[left..mid]. We update ceil to the mid element
            // and reduce our search space to left subarray A[left..mid-1]
            else if (x < A[mid])
            {
                ceil = A[mid];
                right = mid - 1;
            }

            // if x is more than the mid element, ceil exists in the
            // right sub-array A[mid+1..right]
            else{
                floor=A[mid];
                left = mid + 1;
            }
        }

        System.out.print("Number " + x + " -> ");
        System.out.println("ceiling is " + ceil
                + ", floor is " + floor);

    }


    public static void main(String[] args)
    {
        int[] A = { 1, 4, 6, 8, 9 };

        for (int i = 0; i <= 10; i++)
        {
            getFloorCeil(A,i);

        }
    }


}
