package ArrayOfObjects;

public class ClassDataArray {
    private Person[] a;
    private int numElements;

    public ClassDataArray(int max) {
        a = new Person[max];
        numElements = 0;
    }

    public Person find(String searchName) {
        int i;
        for (i = 0; i < numElements; i++) {
            if (a[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == numElements) {
            return null;
        }
        else {
            return a[i];
        }
    }

    public void insert(String last, String first, int age) {
        a[numElements] = new Person(last, first, age);
        numElements++;
    }

    public boolean delete(String searchName) {
        int i;
        for (i = 0; i < numElements; i++) {
            if (a[i].getLastName().equals(searchName)) {
                break;
            }
        }
        if (i == numElements) {
            return false;
        }
        else {
            for (int k = i; k < numElements; k++) {
                a[k] = a[k + 1];
            }
            numElements--;
            return true;
        }
    }

    public void displayArray() {
        for (int i = 0; i < numElements; i++) {
            a[i].displayPerson();
        }
    }
}
