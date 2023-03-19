package HW4;
import java.util.Arrays;

public class MyList<T> {
    /**
     * 
     */
    transient Object[] listData;
    private static final Object[] defaultListData = {};
    private static final Object[] emptyListData = {};
    private int size;

    /**
     * 
     */
    public MyList(){
        this.listData = this.defaultListData;
        this.size = 0;
    }
    /**
     * @param initSize
     */
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
    /**
     * @param initCollection
     */
    public MyList(T[] initCollection){
        this.size = initCollection.length;
        this.listData = initCollection;
    }
    public MyList(T initElement){
        this.size = 1;
        this.listData = new Object[1];
        listData[0] = initElement;
    }

    /**Выод массива в консоль*/
    public void printList(){
        for (Object e : listData){
            System.out.print(e+" ");
        }
        System.out.println();
    }
    // ADD block
    /** Добавление элемента в конец массива
     * @param initElement экземпляр класса T
     */
    public void add(T initElement){
        this.size++;
        listData = Arrays.copyOf(listData, size);
        listData[size-1] = initElement;
    }
    /** Добавление коллекции в конец массива
     * @param initCollection экземпляр-коллекция класса T
     */
    public void add(T[] initCollection){
        this.listData = mergeCollection(listData, initCollection);
    }
    /** Добавление элемента по индексу.
     * <pre>
     * Правила добавления:
     * Индекс > длины массива -> элемент добавляется в конец массива
     * Индекс < 0 -> элемент добавляется с конца массива по индексу (длина массива + индекс)
     * Индекс в пределах длины массива -> элемент добавляется по индексу
     * </pre>
     * @param initElement экземпляр класса T
     * @param index индекс в массиве
     */
    public void addByIndex (T initElement, int index){
        if (index > size) {
            add(initElement);
        }
        else{ 
            if (index < 0) index = size+index;
            Object[] temp = Arrays.copyOfRange(listData,index,this.size);
            listData[index] = initElement;
            grow(1);
            merge(Arrays.copyOfRange(listData,0,index+1), temp);
        }
    }
    /** Добавление коллекции по индексу. Вставка происходит по первому элементу коллекции.
     * <pre>
     * Правила добавления:
     * Индекс > длины массива -> коллекция добавляется в конец массива
     * Индекс < 0 -> коллекция  добавляется с конца массива по индексу (длина массива + индекс)
     * Индекс в пределах длины массива -> коллекция  добавляется по индексу
     * </pre>
     * @param initCollection экземпляр-коллекция класса T
     * @param index индекс в массиве
     */
    public void addByIndex(T[] initCollection, int index){
        if (index > size) {
            add(initCollection);
        }
        else{ 
            if (index < 0) index = size+index;
            Object[] temp = Arrays.copyOfRange(listData,index,this.size);
            grow(initCollection.length);
            this.listData = mergeCollection(mergeCollection(Arrays.copyOfRange(listData,0,index),initCollection), temp);
        }
    }
    /**
     * @param array1
     * @param array2
     */
    public void merge(Object[] array1, Object[] array2){
        for (int i= 0; i < array1.length;i++){
            this.listData[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            this.listData[i+array1.length] = array2[i];
        }
        this.size = array1.length + array2.length;
    }

    /** Слияние коллекций
     * @param array1 коллекция 1
     * @param array2 коллекция 2
     * @return коллекция, образованная из двух исходных
     */
    public Object[] mergeCollection(Object[] array1, Object[] array2){
        Object[] resCollection = new Object[array1.length+array2.length];
        for (int i= 0; i < array1.length;i++){
            resCollection[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            resCollection[i+array1.length] = array2[i];
        }
        this.size = array1.length + array2.length;
        return resCollection;
    }
    /** Увеличение длины массива на указанную величину
     * @param up величина на которую нужно удлинить массив
     */
    private void grow(int up){
        listData = Arrays.copyOf(listData, size+up);
    }
    /** Вывод в консоль длины массива*/
    public void length(){
        System.out.println(listData.length);
    }
}