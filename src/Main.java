public class Main {
    public static void main(String[] args) {
        int balance = 100; //баланс на счете
        int deposit = 5000; //сумма вносимая нас счет

        int bonus = deposit / 100;
        if (deposit < 1000) {
            bonus = 0;
        }

        System.out.println("Количество начисленных бонусов: " + bonus);
        int balanceСheck = balance + deposit + bonus;
        System.out.println("Итоговый баланс на счете: " + balanceСheck);
    }
}