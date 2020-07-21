package ListInsertionSort;

public class ListInsertionSortApp {
    public static void main(String[] args) {
        int size = 10;                         // define the size of the Link array

        Link[] linkArray = new Link[size];     // create the Link array in memory

        for (int i = 0; i < size; i++) {
            int n = (int)(Math.random()*99);   // generate a random number between 0 and 99
            Link newLink = new Link(n);        // create a new Link object and set it to the random number
            linkArray[i] = newLink;            // assign the newLink to the Link array index i
        }

        System.out.print("Unsorted array: ");  // display the Link array's data for each index
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].data + " ");
        }
        System.out.println("");

        SortedList theSortedList = new SortedList(linkArray);   // create the sorted list and initialize it with
                                                                // the Link array as it's argument to constructor
        for (int i = 0; i < size; i++) {
            linkArray[i] = theSortedList.remove();
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(linkArray[i].data + " ");
        }
        System.out.println("");
    }
}
