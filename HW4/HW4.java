package HW4;

public class HW4 {
    public static void main(String[] args) {
        System.out.println("------TEXT-------");
        String[] ar = {"START","hellooooooooo","af","FINISH"};
        MyList<String> myList = new MyList<String>(ar);
        myList.printList();
        myList.length();
        System.out.println("------ADD-------");
        blockAdd(myList);
        myList.printList();
        myList.length();
        System.out.println("------REMOVE-------");
        blockRemove(myList);
        myList.printList();
        myList.length();
        System.out.println(myList.min());
        System.out.println(myList.max());
        System.out.println(myList.findIndex("|FINISH|"));

        System.out.println("------NUM-------");
        Integer[] ar2 = {1,2,3,4};
        MyList<Integer> myList2 = new MyList<Integer>(ar2);
        myList2.printList();
        myList2.length();
        System.out.println("------ADD-------");
        blockAddNUM(myList2);
        myList2.printList();
        myList2.length();
        System.out.println("------REMOVE-------");
        blockRemoveNUM(myList2);
        myList2.printList();
        myList2.length();
        System.out.println(myList2.min());
        System.out.println(myList2.max());
        System.out.println(myList2.sum());
        System.out.println(myList2.multiplication());
        System.out.println(myList2.find(2));
        System.out.println(myList2.findIndex(2));
    }
    public static void blockAdd(MyList<String> myList){
        String[] ar2 = {"|START|","-----","|FINISH|"};
        myList.add("WORLD");
        myList.addByIndex("BYINDEX", 0);
        myList.addByIndex("BYINDEX", 3);
        myList.addByIndex("BYINDEX", 100);
        myList.addByIndex("BYINDEX", -3);
        myList.add(ar2);
        myList.addByIndex(ar2, 0);
        myList.addByIndex(ar2, 3);
        myList.addByIndex(ar2, 100);
        myList.addByIndex(ar2, -3);
    }
    public static void blockRemove(MyList<String> myList){
        int[] aI = {-13,4,100};
        myList.remove();
        myList.removeByIndex(1);
        myList.removeByIndex(aI);
        myList.removeAllElements("BYINDEX");
    }
    public static void blockAddNUM(MyList<Integer> myList){
        Integer[] ar2 = {100,111,100};
        myList.add(4444);
        myList.addByIndex(333, 0);
        myList.addByIndex(333, 3);
        myList.addByIndex(333, 100);
        myList.addByIndex(333, -3);
        myList.add(ar2);
        myList.addByIndex(ar2, 0);
        myList.addByIndex(ar2, 3);
        myList.addByIndex(ar2, 100);
        myList.addByIndex(ar2, -3);
    }
    public static void blockRemoveNUM(MyList<Integer> myList){
        int[] aI = {-13,4,100};
        myList.remove();
        myList.removeByIndex(1);
        myList.removeByIndex(aI);
        myList.removeAllElements(333);
    }
}
        
    