package JosephusProblem;

public class JosephusTest {
    public static void main(String[] args) {
        JosephusList list = new JosephusList(20, 4, 7);

        list.displayList();
        list.getCurrent();
        list.beginDeletion();

        System.out.print("Last remaining: " + list.getCurrent());
    }
}
