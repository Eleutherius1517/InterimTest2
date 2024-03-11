package View;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.IGetView;
import Model.Domain.Fruit;

public class ViewFruitsClass implements IGetView {
    public void printAllFruits(List<Fruit> fruits){
        System.out.println("---Список фруктов---");
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName());
        }
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
        System.out.println("----------------------------------");
    }
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
    public void showMenu(){
        System.out.println("Меню: ");
        System.out.println("1. Загрузить файл с фруктами(это важно сделать!)");
        System.out.println("2. Распечатать список фруктов из файла");
        System.out.println("3. Посчитать слова в файле");
        System.out.println("4. Найти самое длинное слово" );
        System.out.println("5. Вычислить частоту слов" );
        System.out.println("6. Закончить работу и выйти" );
    }
}
