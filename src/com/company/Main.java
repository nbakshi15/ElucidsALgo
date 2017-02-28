package com.company;
import java.util.*;
public class Main {

    public static int main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the first number");
        int fnum = input.nextInt();
        System.out.println("Enter the second number");
        int snum = input.nextInt();
        System.out.println ("The GCD factor is ");

        public static int inter {
            int num;
            int xnum = snum;
            for (int k = 0; k < xnum; k++){
                if(fnum == 1)
                    return 1;
                 num = fnum % snum;
                if (num == 0)
                    return snum;
                fnum = snum;
                snum = xnum;
            }
            return 1;
        }
    }

        public static int recur (int fnum, int snum) {
            if (fnum ==1)
                return 1;
            int num = fnum % snum;
            if (num == 0)
                return snum;

            return recur(snum,num);
        }

    }

