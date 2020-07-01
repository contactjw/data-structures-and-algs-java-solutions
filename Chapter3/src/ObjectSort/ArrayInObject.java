package ObjectSort;

public class ArrayInObject {
    private Person[] a;
    private int numElements;

    public ArrayInObject(int max) {
        a = new Person[max];
        numElements = 0;
    }

    public void insert(String first, String last, int age) {
        a[numElements] = new Person(first, last, age);
        numElements++;
    }

    public void display() {
        for (int i = 0; i < numElements; i++) {
            a[i].displayPerson();
        }
        System.out.println("");
    }

    public void insertionSort() {
        int in, out;

        for (out = 1; out < numElements; out++) {
            Person temp = a[out];
            in = out;
            while (in > 0 && a[in - 1].getLastName().compareTo(temp.getLastName()) > 0) {
                a[in] = a[in - 1];
                --in;
            }
            a[in] = temp;
        }
    }
}
