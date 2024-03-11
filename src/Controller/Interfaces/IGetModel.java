package Controller.Interfaces;

import java.util.List;

import Model.Domain.Fruit;

public interface IGetModel {
    public void loadFruits();
    public void computeAmountWord();
    public String findLongWord();
    public void mostPopularFruits();
    public List<Fruit> getFruitsList();
}
