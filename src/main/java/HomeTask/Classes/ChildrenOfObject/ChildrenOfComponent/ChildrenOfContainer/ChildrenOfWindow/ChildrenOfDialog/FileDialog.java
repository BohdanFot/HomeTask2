package HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow.ChildrenOfDialog;

import HomeTask.Classes.ChildrenOfObject.ChildrenOfComponent.ChildrenOfContainer.ChildrenOfWindow.Dialog;
import HomeTask.Interfaces.*;

public class FileDialog extends Dialog implements Ifocusable, Ivisible, Idraggable {
    public FileDialog(String name) {
        super(name);
    }

    public void openFile(String filename){
        if(inFocus & visibl)
        System.out.println("The " + filename + " file is opened!!");
        else System.out.println("The '" + name + "' doesn't in focus or isn't visible!!");

    }

}
