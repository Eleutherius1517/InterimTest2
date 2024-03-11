package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import Controller.Interfaces.IGetModel;
import Model.Domain.Fruit;

public class Fruits implements IGetModel {
    private List<Fruit> fruitsList;
    
    private String fileName;
    public Fruits(String fileName) {
        this.fruitsList = new ArrayList<>();
        this.fileName = fileName;
    }
    public void loadFruits(){
        fruitsList.clear();
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            line = bufferedReader.readLine();
            String[] fields = line.split("\\s+");
            for (String fruitStr : fields) {
                String name = fruitStr.substring(0, 1).toUpperCase() + fruitStr.substring(1);
                Fruit fruit = new Fruit(name);
                fruitsList.add(fruit);
            }
            
        } catch (IOException e) {
            System.out.println("При загрузке заметки произошла ошибка: " + e.getMessage());
        }
    }
    public void computeAmountWord(){
        if(fruitsList.isEmpty()){
            System.out.println("Файл не загружен! В начале загрузите файл!");
            return;
        }
        int sizeList = fruitsList.size();
        System.out.println("Kоличество слов в файле "  + this.fileName + ": " + sizeList);

    }
    public String findLongWord(){
        if(fruitsList.isEmpty()){
            System.out.println("Файл не загружен! В начале загрузите файл!");
            return "";
        }
        String longWord = "";
        for (Fruit fruit : fruitsList) {
            if (longWord.length() < fruit.getAmountWords()) {
                longWord = fruit.getName();
            }
        }
        return longWord;
    }
    public void mostPopularFruits(){
        if(fruitsList.isEmpty()){
            System.out.println("Файл не загружен! В начале загрузите файл!");
            return;
        }
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (Fruit fruit : fruitsList) {
            if (!wordToCount.containsKey(fruit.getName())){
            wordToCount.put(fruit.getName(), 0);
            }
            wordToCount.put(fruit.getName(), wordToCount.get(fruit.getName()) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println("Слово " + word + " встречается " + wordToCount.get(word) + " раз!");
        }
    }
    public List<Fruit> getFruitsList() {
        if(fruitsList.isEmpty()){
            System.out.println("Файл не загружен! В начале загрузите файл!");
            return Collections.emptyList();
        }
        return fruitsList;
    }
}
