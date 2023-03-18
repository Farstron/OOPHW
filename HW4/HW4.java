package HW4;

public class HW4 {
    public static void main(String[] args) {
        String[] ar = {"hello","af", "hello","af", "hello","af"};
        MyList<String> myList = new MyList<String>(ar);
        myList.printList();
        myList.add("world");
        myList.printList();
        myList.addByIndex("argtb", -3);
        myList.printList();
        myList.length();
        myList.add(ar);
        myList.printList();
    }
}