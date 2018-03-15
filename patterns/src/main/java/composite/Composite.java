package composite;

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void addComponent(Component component){
        this.componentArrayList.add(component);
    }

    public void removeComponent(Component component){
        this.componentArrayList.remove(component);
    }

    public ArrayList<Component> getComponentArrayList() {
        return componentArrayList;
    }

    @Override
    public void componentOperation() {
        System.out.println("this is a composite operation");
    }
}
