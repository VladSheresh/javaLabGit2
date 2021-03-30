package eu.senla.javacources.menu.actions;

import eu.senla.javacources.menu.Action;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BiggestFigureAction implements Action {

    @Override
    public void execute() {
        int number = new java.util.Random().nextInt(899) + 100;
        System.out.println("Трёзначное число: " + number);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(number % 10);
        numbers.add((number / 10) % 10);
        numbers.add((number / 100) % 10);
        System.out.println("Наибольшая цифра: " + Collections.max(numbers));
    }
}
