package PriorityQFastInsert;

public class PriorityQFastInsertApp {
    public static void main(String[] args) {
        PrioQFastInsert prioq = new PrioQFastInsert(12);

        prioq.insert(51);
        prioq.insert(9);
        prioq.insert(4);
        prioq.insert(16);
        prioq.insert(19);
        prioq.insert(7);
        prioq.insert(32);
        prioq.insert(69);
        prioq.insert(59);
        prioq.insert(43);
        prioq.insert(1);
        prioq.insert(12);
        prioq.insert(64);
        prioq.insert(95);


        prioq.display();

        prioq.delete();
        prioq.display();

        prioq.delete();
        prioq.display();

        prioq.delete();
        prioq.display();

        prioq.delete();
        prioq.display();





    }
}
