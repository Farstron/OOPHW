package HW4;

public class HW4 {
    public static void main(String[] args) {
        String[] ar = {"START","hello","af", "hello","af", "hello","af","FINISH"};
        String[] ar2 = {"|START|","-----","-----", "-----","|FINISH|"};
        MyList<String> myList = new MyList<String>(ar);
        myList.printList();
        myList.add("WORLD");
        myList.printList();
        myList.addByIndex("BYINDEX", 0);
        myList.addByIndex("BYINDEX", 3);
        myList.addByIndex("BYINDEX", 100);
        myList.addByIndex("BYINDEX", -3);
        myList.printList();
        myList.add(ar2);
        myList.printList();
        myList.addByIndex(ar2, 0);
        myList.addByIndex(ar2, 3);
        myList.addByIndex(ar2, 100);
        myList.addByIndex(ar2, -3);
        myList.printList();







        
        myList.length();
    }
}