package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumFirstDigitsAction implements Action {
    @Override
    public void execute() {
        int number1 = new java.util.Random().nextInt(899) + 100;
        int number2 = new java.util.Random().nextInt(899) + 100;
        int number3 = new java.util.Random().nextInt(899) + 100;
        System.out.println("Трёзначное число: " + number1 + "  " + number2 + "  " + number3);
        System.out.println("Сумма первых цифр: " + ((number1 / 100) % 10 + (number2 / 100) % 10 + (number3 / 100) % 10));
    }
}
