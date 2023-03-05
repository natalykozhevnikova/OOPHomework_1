
package OOPHomework1;
import java.util.ArrayList;

public class FamilyTree {

    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }
    public void appendParentChild(People parent, People child) {
        tree.add(new Node(parent, Family.parent, child));
        tree.add(new Node(child, Family.child, parent));
    }
    public void appendWifeHusband(People wife, People husband) {
        tree.add(new Node(wife, Family.wife, husband));
        tree.add(new Node(husband, Family.husband, wife));
    }

}