package OOPHomework1;

public class Main {
    public static void main(String[] args) {
        People nina = new People("Nina", 30 years old);
        People petr = new People("Petr", 35 years old);
        People marina = new People("Marina", 10 years old);
        People ivan = new People("Ivan", 9 years old);
        People boris = new People("Boris", 15 years old);
        FamilyTree gt = new FamilyTree();
        gt.appendParentChild(nina, marina);
        gt.appendParentChild(nina, ivan);
        gt.appendParentChild(petr, marina);
        gt.appendParentChild(petr, ivan);
        gt.appendWifeHusband(nina, petr);
        gt.appendParentChild(petr, boris);


        System.out.println("К детям Нины относятся: ");
        System.out.println(new Research(gt).spend(Nina, Family.parent));
        System.out.println("К детям Петра относятся: ");
        System.out.println(new Research(gt).spend(Petr, Family.parent));
        System.out.println("Кто является мужем Нины");
        System.out.println(new Research(gt).spend(Nina, Family.wife));
        System.out.println(new Research(gt).searchAge());
    }
}