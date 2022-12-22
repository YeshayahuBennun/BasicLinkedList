import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        BasicLinkedList bll = new BasicLinkedList();

        bll.add("Ac");
        bll.add("Rj");
        bll.add("Sp");

        System.out.println("Head: " + bll.getHead().getValue());
        System.out.println("Tail: " + bll.getTail().getValue());
        System.out.println("size: " + bll.getSize());
        System.out.println();
        for (int i = 0; i < bll.getSize(); i++) {
            System.out.println(bll.get(i).getValue());
        }

        System.out.println("After deleting"+" RJ ");
        System.out.println();

        bll.remove("RJ");
        System.out.println();
        for (int i = 0; i < bll.getSize(); i++) {
            System.out.println(bll.get(i).getValue());
        }
    }
}
