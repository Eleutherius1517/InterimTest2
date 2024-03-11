package Controller;

import Controller.Interfaces.IGetModel;
import Controller.Interfaces.IGetView;

public class ControllerFruitsClass {
    private IGetModel model;
    private IGetView view;
    public ControllerFruitsClass(IGetModel model, IGetView view) {
        this.model = model;
        this.view = view;
    }
    public void run(){
        boolean getNewIter = true;
        while (getNewIter) {
            view.showMenu();
            String command = view.prompt("Введите номер операции: ");
            switch (command) {
                case "1":
                    model.loadFruits();
                    System.out.println("Список фруктов загружен из файла");
                    break;
        
                case "2":
                    view.printAllFruits(model.getFruitsList());
                    break;
        
                case "3":
                    model.computeAmountWord();
                    break;
        
                case "4":
                    String longWord = model.findLongWord();
                    System.out.println("Самое длинное слово: " + longWord);
                    break;
                case "5":
                    model.mostPopularFruits();
                    break;
                case "6":
                    System.out.println("Работа программы завершена!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Не распознанная команда! Повторите комманду еще раз!");
                    break;
            }
        }
        
    }
}
