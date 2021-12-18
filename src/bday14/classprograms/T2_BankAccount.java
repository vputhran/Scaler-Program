package bday14.classprograms;

import java.util.Scanner;

public class T2_BankAccount {
    public static void main(String[] args) {
        //Initial Account Balance
        Scanner sc = new Scanner(System.in);
        long bal = sc.nextInt();

        //No. of Operations
        int M = sc.nextInt();

        for (int i = 1; i <= M; i++) {
            int type = sc.nextInt();
            long amt = sc.nextLong();

            if (type == 1) {
                bal = creditDebit(type, amt, bal);
                System.out.println(bal);

            } else if ((type == 2) && (bal > amt)){
                bal = creditDebit(type, amt, bal);
                System.out.println(bal);
            }else {
                System.out.println("Insufficient Funds");
            }

        }

    }

    public static long creditDebit(int type, long amount, long Bal) {
        if (type == 1) {
            Bal = Bal + amount;
        }else {
            Bal = Bal - amount;
        }
        return Bal;

    }
}
