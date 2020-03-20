package testpakg.array.leetCode;

/*

At a lemonade stand, each lemonade costs $5.

Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).

Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.

Note that you don't have any change in hand at first.

Return true if and only if you can provide every customer with correct change.

Input: [5,5,5,10,20]
Output: true
Explanation:
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.

https://leetcode.com/problems/lemonade-change/
 */

import java.util.HashMap;

public class LemonadeChange {



        public static void main(String[] args) {

            System.out.println(lemonadeChange1(new int[]{5,5,5,5,5,5,5,10,10,20,20}));

        }

        public static boolean lemonadeChange(int[] bills) {

            int sum=0,change;
            boolean res=true;
            for(int i=0;i<bills.length;i++){
                if(bills[i]>5){
                    change=bills[i]-5;
                    if(i==0)
                        return false;
                    else if(sum>=change){
                        sum=sum-change+bills[i];
                    }
                    else
                        return false;
                }
                else{
                    sum+=bills[i];
                }
            }
            return res;

        }

    public static boolean lemonadeChange1(int[] bills) {

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        boolean res=true;
        hashMap.put(5,0);
        hashMap.put(10,0);
        hashMap.put(20,0);
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                    res=true;
                    hashMap.put(5,hashMap.get(bills[i])+1);
            }
            else if(bills[i]==10){
                if(hashMap.get(5)>=1){
                    res=true;
                    hashMap.put(5,hashMap.get(5)-1);
                    hashMap.put(10,hashMap.get(10)+1);
                }
                else
                    return false;
            }
            else if(bills[i]==20){
                if(hashMap.get(5)>=3){
                    res=true;
                    hashMap.put(5,hashMap.get(5)-3);
                }
                else if(hashMap.get(5)>=1 && hashMap.get(10)>=1)
                {
                    hashMap.put(5,hashMap.get(5)-1);
                    hashMap.put(10,hashMap.get(10)-1);
                }
                else
                    return false;
            }
        }
        return res;

    }
    }