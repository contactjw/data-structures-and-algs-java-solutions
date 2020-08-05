package TwoDimensionLinkedList;

public class TwoDimensionalList {
    private Node first;
    private Node colPointer;
    private Node rowPointer;
    private int numRows;
    private int numCols;

    public TwoDimensionalList(int rows, int columns) {
        numRows = rows;
        numCols = columns;
        first = null;
        colPointer = null;
        Node colAbovePointer = null;
        rowPointer = null;

        for (int currRowNumber = 0; currRowNumber < rows; currRowNumber++) {
            for (int currColNumber = 0; currColNumber < columns; currColNumber++) {
                if (first == null) {
                    first = new Node(0);
                    colPointer = first;
                    rowPointer = first;
                }
                else if (rowPointer == null) {
                    rowPointer = new Node(0);
                    if (currRowNumber > 0) {
                        colAbovePointer.below = rowPointer;
                        colAbovePointer = colAbovePointer.next;
                    }
                    colPointer = rowPointer;
                }
                else {
                    colPointer.next = new Node(0);
                    colPointer = colPointer.next;
                    if (currRowNumber > 0) {
                        colAbovePointer.below = colPointer;
                        colAbovePointer = colAbovePointer.next;
                    }
                }
            }
            colAbovePointer = rowPointer;
            rowPointer = rowPointer.below;
            colPointer = rowPointer;
        }
    }

    public void insertValue(int row, int col, int data) {
        Node colPointer = first;
        Node rowPointer = first;

        System.out.println("Inserting " + data);

        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < col + 1; j++) {
                colPointer = colPointer.next;
            }
            if (i == row) {
                rowPointer = rowPointer.below;
                colPointer = rowPointer;
            }
        }
        colPointer.data = data;
    }

    public void display() {
        Node colPointer = first;
        Node rowPointer = first;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                colPointer.display();
                colPointer = colPointer.next;
            }
            System.out.println("");
            rowPointer = rowPointer.below;
            colPointer = rowPointer;
        }
    }

}
