public class TowersApp {

    static int numDisks = 3;

    public static void main(String[] args) {
        doTowers(numDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topDisk, char from, char inter, char to) {
        if (topDisk == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        }
        else {
            doTowers(topDisk - 1, from, to, inter);

            System.out.println("Disk " + topDisk + " from " + from + " to " + to);

            doTowers(topDisk - 1, inter, from, to);
        }
    }
}
