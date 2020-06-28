package ArrayOfObjects;

public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray classArr = new ClassDataArray(100);

        classArr.insert("Evans", "Patty", 24);
        classArr.insert("Smith", "Lorraine", 37);
        classArr.insert("Yee", "Tom", 43);
        classArr.insert("Adams", "Henry", 63);
        classArr.insert("Hashimoto", "Sato", 21);
        classArr.insert("Stimson", "Henry", 29);
        classArr.insert("Velasquez", "Jose", 72);
        classArr.insert("Lamarque", "Henry", 54);
        classArr.insert("Vang", "Minh", 22);
        classArr.insert("Creswell", "Lucinda", 18);

        classArr.displayArray();

        System.out.println("");

        String searchKey = "Stimson";
        Person found;
        found = classArr.find(searchKey);

        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        }
        else {
            System.out.println("Can't find " + searchKey);
        }

        System.out.println("");

        System.out.println("Deleting Smith, Yee, and Creswell");
        classArr.delete("Smith");
        classArr.delete("Yee");
        classArr.delete("Creswell");

        classArr.displayArray();
    }
}
