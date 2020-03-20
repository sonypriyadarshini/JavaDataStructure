package testpakg;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public static void ArrayRotation() {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < 7; i++) {
            System.out.println("before rotation: "+a[i]);
        }
        int temp[] = new int[2];
        for (int i = 0; i < 2; i++) {
            temp[i] = a[i];
        }
        for (int i = 0; i < 5; i++) {
            a[i] = a[i + 2];
        }
        for (int i = 0; i < 2; i++) {
            a[i+5]=temp[i];
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("after rotation: "+a[i]);
        }
    }
}
