package practice;

import java.util.HashSet;

public class HappyNumber {

    HashSet<Integer> seen = new HashSet<>();
    public  boolean isHappyNumber(int n){
        while(n!=1){
        if(seen.contains(n)){
            return false;
        }
        seen.add(n);
        n = getSquare(n);
        }

        return true;
    }

    public int getSquare(int n){
        int sum = 0;
        while(n>0){
            int digit = n%10 ;
            sum += digit *digit;
            n = n/10;
        }
        return  sum;
    }
    public static void main(String[] args){
        HappyNumber hp  = new  HappyNumber();
        int num = 19;
        System.out.println("Is the Given Number is Happy Number ?"+hp.isHappyNumber(num));
    }
}
