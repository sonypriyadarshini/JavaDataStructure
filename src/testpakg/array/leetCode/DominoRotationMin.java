package testpakg.array.leetCode;

import java.util.HashMap;

public class DominoRotationMin {

    public static void main(String[] args) {

        System.out.println(minDominoRotations(new int[]{3,5,1,2,3},new int[]{3,6,3,3,4}));
    }

    public static int minDominoRotations(int[] A, int[] B) {
        int res=0;
        int maxA=0,maxB=0,maxValA=0,maxValB=0;
        HashMap<Integer,Integer>hm1=new HashMap<>();
        for(int i:A){

            if(hm1.containsKey(i))
                hm1.put(i,hm1.get(i)+1);
            else
            hm1.put(i,1);
            if(maxA<hm1.get(i)){
                maxValA=i;
                maxA= hm1.get(i);
            }
        }
        System.out.println("maxValA "+maxValA+"  count"+maxA);
        hm1.clear();;
        for(int i:B){
//            System.out.println(i);
            if(hm1.containsKey(i))
                hm1.put(i,hm1.get(i)+1);
            else
            hm1.put(i,1);
            if(maxB<hm1.get(i)){
                maxValB=i;
                maxB= hm1.get(i);
//                System.out.println(i+"  :  "+hm1.get(i));

            }
        }
        System.out.println("maxValB "+maxValB+"  count"+maxB);
        int val;
        if(maxA>maxB)
            val=maxValA;
        else
            val=maxValB;
        int rotA=0,rotB=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==val && B[i]!=val){
                rotA++;
            }
            else if(A[i]!=val && B[i]==val){
                rotB++;
            }
            else if(A[i]!=val && B[i]!=val){
                return -1;
            }
        }
        res=Math.min(rotA,rotB);
        return res;

    }
    }
