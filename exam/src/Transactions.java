public class Transactions  {

    public static void addMoney(BankMoney schet, int newMoney){
        if (isMoreThen0(newMoney)){
            schet.setMoney(schet.getMoney() + newMoney);
        }
    }

    public static void getMoneyToCash(BankMoney schet, int money){
        if (schet.getMoney() - money >= 0){
            schet.setMoney(schet.getMoney() - money);
        }
    }

    public static void sendMoney(BankMoney from, BankMoney to, int money){
        if (from.getMoney() - money >= 0){
            to.setMoney(to.getMoney() + money);
            from.setMoney(from.getMoney() - money);
        } else {
            throw new DontHaveCashOnItExcemption();
        }
    }


    private static boolean isMoreThen0(int value){
        return value > 0;
    }
}
