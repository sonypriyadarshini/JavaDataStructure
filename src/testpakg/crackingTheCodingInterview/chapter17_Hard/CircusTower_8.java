package testpakg.crackingTheCodingInterview.chapter17_Hard;

/*
Circus Tower: A circus is designing a tower routine consisting of people standing atop one anoth- er's shoulders.
For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her.
Given the heights and weights of each person in the circus,
write a method to compute the largest possible number of people in such a tower.

 */

public class CircusTower_8 {

    public static void main(String[] args) {
        double myArr[][]=new double[][]{{65, 200}, {70, 150}, {56, 90}, {75, 190},{60, 95}, {68, 110}};
        java.util.Arrays.sort(myArr, java.util.Comparator.comparingDouble(a -> a[0]));
        for(int i=0;i<myArr.length-1;i++){
            if(myArr[i][1]<myArr[i+1][1])
                System.out.println(myArr[i][0]+" , "+myArr[i][1]);
            if(i==myArr.length-2 && myArr[i+1][1]>myArr[i][1])
                System.out.println(myArr[i+1][0]+" , "+myArr[i+1][1]);
        }


    }
}
