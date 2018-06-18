package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent;

import HomeTask.Classes.ChildrenOfObject.Component;
import HomeTask.Interfaces.*;


public class Button extends Component implements Iclicable, Ivisible {

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void click() {
        if (visibl) System.out.println("Click on the '" + name + "'");
        else System.out.println("The '" + name + "' isn't visible!!");
    }
}
