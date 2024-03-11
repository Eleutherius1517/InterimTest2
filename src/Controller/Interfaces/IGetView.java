package Controller.Interfaces;

import java.util.List;

import Model.Domain.Fruit;

public interface IGetView {
    public void printAllFruits(List<Fruit> fruits);
    public String prompt(String msg);
    public void showMenu();
}
