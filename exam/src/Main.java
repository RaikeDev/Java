// Класс описывающий банковский счет
// На счету есть деньги, целое число. Деньги можно увеличивать или уменьшать, не может быть отрицательного числа.
// Есть номер счета, он неизменяемый. String.
// Любое изменение денег на счету считается транзакцией. Внести деньги, забрать деньги или перевести деньги со счета на счет.
// Транзакции нельзя изменить или забыть о них.
// Но транзакции перевода со счета на счет можно пометить отмененными, тогда деньги должны вернуться

public class Main {
    public static void main(String[] args){
        BankMoney schet = new BankMoney("1232a", 1000);
        System.out.println(schet);

        BankMoney schet2 = new BankMoney("12", 50);
        System.out.println(schet2);

        System.out.println("------------ send money ------------");

//        Transactions transact = new Transactions(schet, schet2);

        Transactions.sendMoney(schet, schet2, 50);
        System.out.println(schet);
        System.out.println(schet2);

        System.out.println("------------ get money ------------");

        Transactions.getMoneyToCash(schet, 200);
        System.out.println(schet);

        System.out.println("------------ add money ------------");

        Transactions.addMoney(schet, 100);
        System.out.println(schet);
    }
}
