package HW4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    transient Object[] listData;
    private static final Object[] defaultListData = {};
    private static final Object[] emptyListData = {};
    private int size;
    public MyList(){
        this.listData = this.defaultListData;
        this.size = 0;
    }
    public MyList(int initSize){
        if (initSize >= 0){
            this.listData = new Object[initSize];
            this.size = initSize;
        }else if(initSize == 0){
            this.listData = this.emptyListData;
            this.size = initSize;
        }else {
            throw new IllegalArgumentException("Illegal Size: "+ initSize);
        }
        
    }
    public MyList(T[] initCollection){
        this.size = initCollection.length;
        this.listData = initCollection;
    }
    public MyList(T initElement){
        this.size = 1;
        this.listData = new Object[1];
        listData[0] = initElement;
    }
    public void printList(){
        for (Object e : listData){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    public void add(T initElement){
        this.size++;
        listData = Arrays.copyOf(listData, size);
        listData[size-1] = initElement;
    }
    public void addByIndex (T initElement, int index){
        if (index > size) {
            add(initElement);
        }
        else{ 
            if (index < 0) index = size+index;
            Object[] temp = Arrays.copyOfRange(listData,index,this.size);
            listData[index] = initElement;
            merge(Arrays.copyOfRange(listData,0,index+1), temp);
        }

    }
    public void merge(Object[] array1, Object[] array2){
        for (int i= 0; i < array1.length;i++){
            this.listData[i] = array1[i];
        }
        grow();
        for (int i = 0; i < array2.length; i++){
            this.listData[i+array1.length] = array2[i];
        }
        this.size = array1.length + array2.length;
    }
    private void grow(){
        listData = Arrays.copyOf(listData, size+1);
    }
}