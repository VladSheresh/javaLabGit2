package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;

public class SumDigitsAction  implements Action {
    @Override
    public void execute() {
        int number = new java.util.Random().nextInt(899) + 100;
        System.out.println("Трёзначное число: " + number);
        System.out.println("Сумма первых цифр: " + ((number / 100) % 10 + (number / 10) % 10 + number % 10));
    }
}
