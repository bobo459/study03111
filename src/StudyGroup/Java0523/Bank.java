package StudyGroup.Java0523;

import java.util.Scanner;

public class Bank {
    public int balance(int myMoney){
        return myMoney;
    }
    public int withdraw(int myMoney){
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금하실 금액을 입력하세요.");
        int withdraw = scanner.nextInt();
        myMoney = myMoney-withdraw;
        return myMoney;
    }
    public int deposit(int myMoney){
        Scanner scanner = new Scanner(System.in);
        System.out.println("입금하실 금액을 입력하세요.");
        int deposit = scanner.nextInt();
        myMoney = myMoney + deposit;
        return myMoney;
    }
    public int remittance(int myMoney, int youMoney){
        Scanner scanner = new Scanner(System.in);
        System.out.println("출금하실 금액을 입력하세요.");
        int withdraw = scanner.nextInt();
        myMoney = myMoney - withdraw;
    /*    youMoney = youMoney + withdraw;
        int [] all = {myMoney,youMoney};
        return all;*/
        return myMoney;
    }
}
