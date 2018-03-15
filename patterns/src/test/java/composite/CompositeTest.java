package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompositeTest {
    @Test
    void componentOperation() {
        Composite root = new Composite();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();

        branch.addComponent(leaf);
        root.addComponent(branch);

        this.display(root);

    }

    private void display(Composite composite){
        for (Component c : composite.getComponentArrayList()){
            if (c instanceof Leaf){
                c.componentOperation();
            }
            else{
                c.componentOperation();
                this.display((Composite)c);
            }

        }
    }


}