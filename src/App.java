import Controller.ControllerFruitsClass;
import Controller.Interfaces.IGetModel;
import Controller.Interfaces.IGetView;
import Model.Fruits;
import View.ViewFruitsClass;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "input.txt";
        IGetModel model = new Fruits(fileName);
        IGetView view = new ViewFruitsClass();
        ControllerFruitsClass controller = new ControllerFruitsClass(model, view);
        controller.run();
    }
}
