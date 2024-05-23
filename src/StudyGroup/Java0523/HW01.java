package StudyGroup.Java0523;
/*
[은행어플]
1. 내 통장 잔고를 확인하는 메서드 구현
2. 출금 요청이 왔을때 출금하는 메서드 구현
3. 입금 요청이 왔을때 입금하는 메서드 구현
4. 송금 요청이 왔을때 송금하는 메서드 구현
*/
public class HW01 {
    public static void main(String[] args) {
        int myMoney = 1000;
        int youMoney = 5000;
        //3번 메서드 실행 -> 5000원 입금해주세요.
        //1번 메서드 실행
        //2번 메서드 실행 -> 3000원 출금해주세요.
        //1번 메서드 실행
        //4번 메서드 실행 -> 1500원 송금해주세요.
        //1번 메서드 실행

        Bank bank = new Bank();
        myMoney = bank.balance(myMoney);
        System.out.println(myMoney);
        myMoney = bank.deposit(myMoney);
        System.out.println(myMoney);
        myMoney = bank.withdraw(myMoney);
        System.out.println(myMoney);
/*        int [] all =new int[2];
        myMoney = bank.remittance(myMoney,youMoney);
        all[0] =myMoney;
        all[1] = youMoney;
        System.out.println(myMoney);
        System.out.println(youMoney);*/
    }
}
