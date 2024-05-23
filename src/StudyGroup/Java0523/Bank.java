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
        int money = myMoney-withdraw;
        return money;
    }
    public int deposit(int myMoney, int deposit){
        int money = myMoney + deposit;
        return money;
    }
    public int remittance(int myMoney){
        Scanner scanner = new Scanner(System.in);
        System.out.println("송금할 계좌와 이름 금액을 입력해주세요.");
        String[] account = new String[]{scanner.nextLine()};
        String[] name = new String[]{scanner.nextLine()};
        int withdraw = scanner.nextInt();
        int money = myMoney - withdraw;
        return money;
    }
}
