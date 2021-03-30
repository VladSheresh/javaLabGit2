package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;

public class ComparisonNumbersAction implements Action {

    @Override
    public void execute() {
        int number1 = new java.util.Random().nextInt(899) + 100;
        int number2 = new java.util.Random().nextInt(899) + 100;
        int number3 = new java.util.Random().nextInt(899) + 100;
        System.out.println("Трёзначное число: " + number1 + "  " + number2 + "  " + number3);
        System.out.println("Слоожение двух чисел: " + (number1 * 1000  + number2));
        System.out.println("Разница между числами: " + ((number1 * 1000  + number2) - number3));
    }

}
