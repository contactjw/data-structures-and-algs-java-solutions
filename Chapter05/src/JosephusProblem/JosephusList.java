package JosephusProblem;

public class JosephusList {
    private CircularList list = new CircularList();
    private int numPeople;
    private int numToCount;
    private int startNum;

    public JosephusList(int numPeople, int numToCount, int startNum) {
        this.numPeople = numPeople;
        this.numToCount = numToCount;
        this.startNum = startNum;

        for (int i = 0; i < numPeople; i++) {
            list.insert(i + 1);
        }
    }

    public void beginDeletion() {
        for (int i = list.getSize(); i > 1; i--) {
            for (int j = 0; j < numToCount + 1; j++) {
                step();
            }
            list.delete();
            System.out.print("Current list: ");
            list.display();
        }
    }

    public void displayList() {
        list.display();
    }

    public void step() {
        list.step();
    }

    public int getCurrent() {
        return list.getCurrent();
    }


}
