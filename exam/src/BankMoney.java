// Класс описывающий банковский счет
// На счету есть деньги, целое число. Деньги можно увеличивать или уменьшать, не может быть отрицательного числа.
// Есть номер счета, он неизменяемый. String.
// Любое изменение денег на счету считается транзакцией. Внести деньги, забрать деньги или перевести деньги со счета на счет.
// Транзакции нельзя изменить или забыть о них.
// Но транзакции перевода со счета на счет можно пометить отмененными, тогда деньги должны вернуться

public class BankMoney {
    private int money;
    private final String number;

    public BankMoney(String number, int money) {
        this.number = number;
        if (!isMoreThen0(money)){
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    public BankMoney(String number){
        this(number, 0);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (!isMoreThen0(money)){
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    public String getNumber() {
        return number;
    }


    private boolean isMoreThen0(int value){
        return value > 0;
    }



    @Override
    public String toString() {
        return "BankMoney{ " +
                "money=" + money +
                ", number='" + number + '\'' + " " +
                '}';
    }
}
