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
            this.listData = mergeCollection(Arrays.copyOfRange(listData,0,index+1), temp);
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
    /** Удаление послнднего элемента*/
    public void remove(){
        if (size > 0){
            this.size --;
            this.listData=Arrays.copyOfRange(listData,0,size);
        }else{
            throw new IllegalArgumentException("Array Is Empty");
        } 
    }
    /** Удаление элемента по индексу
     * <pre>
     * Правила удаления:
     * Индекс > длины массива -> элемент удаляется из конеца массива
     * Индекс < 0 -> элемент удаляется с конца массива по индексу (длина массива + индекс)
     * Индекс в пределах длины массива -> элемент удаляется по индексу
     * </pre>
     * @param index индекс в массиве
     */
    public void removeByIndex(int index){
        if (index > size) {
            remove();
        }
        else{
            if (index < 0) index = this.size+index;
            this.listData = mergeCollection(Arrays.copyOfRange(listData,0,index), Arrays.copyOfRange(listData,index+1,this.size));
        }
    }
    /**Удаление элементов по массиву индексов
     * <pre>
     * Правила удаления:
     * Индекс > длины массива -> элемент удаляется из конеца массива
     * Индекс < 0 -> элемент удаляется с конца массива по индексу (длина массива + индекс)
     * Индекс в пределах длины массива -> элемент удаляется по индексу
     * </pre>
     * @param indexArray массив индексов
     */
    public void removeByIndex(int[] indexArray){
        for(int i : indexArray) removeByIndex(i);
    }
    /**Удаление всех заданных элементов
     * @param element заданный элемент
     */
    public void removeAllElements(T element){
        for (int i = 0; i < this.size; i++){
            if (this.listData[i].equals(element)) {
                removeByIndex(i);
                i--;
            }
        }
    }
    /**Поиск минимального элемента массива. Если это массив строк, то находит строку с минимальной длиной.
     * @return Минимальный элемент
     */
    public Object min(){
        Object min = this.listData[0];
        for (Object e : listData){
            if ((e instanceof Integer) || (e instanceof Double) || (e instanceof Float))
                if ((Integer)e < (Integer)min)
                    min = e;
            if (e instanceof String)
                if (e.toString().length() < min.toString().length())
                    min = e;
        }
        return min;
    }
    /**Поиск максимального элемента массива. Если это массив строк, то находит строку с максимального длиной.
     * @return Максимальный элемент
     */
    public Object max(){
        Object max = this.listData[0];
        for (Object e : listData){
            if ((e instanceof Integer) || (e instanceof Double) || (e instanceof Float))
                if ((Integer)e > (Integer)max)
                max = e;
            if (e instanceof String)
                if (e.toString().length() > max.toString().length())
                max = e;
        }
        return max;
    }
    /**Сумма элементов массива.
     * @return Сумма элементов массива
     */
    public Object sum(){
        if (listData[0] instanceof Integer){
            int sum = 0;
            for(Object e : listData)
                sum+=(Integer)e;
            return sum;
        }else
        if (listData[0] instanceof Double){
            Double sum = 0.0;
            for(Object e : listData)
                sum+=(Double)e;
            return sum;
        }else
        if (listData[0] instanceof Float){
            Float sum = 0F;
            for(Object e : listData)
                sum+=(Float)e;
            return sum;
        }else
        return null;
    }
    /**Произведение элементов массива.
     * @return Произведение элементов массива
     */
    public Object multiplication(){
        if (listData[0] instanceof Integer){
            int sum = 1;
            for(Object e : listData)
                sum*=(Integer)e;
            return sum;
        }else
        if (listData[0] instanceof Double){
            Double sum = 1.0;
            for(Object e : listData)
                sum*=(Double)e;
            return sum;
        }else
        if (listData[0] instanceof Float){
            Float sum = 1F;
            for(Object e : listData)
                sum*=(Float)e;
            return sum;
        }else
        return null;
    }
    /**Поиск последнего вхождения элемента
     * @param element искомый элемент
     * @return индекс последнего вхождения
     */
    public int findIndex(Object element){
        int index = -1;
        for (int i = 0; i < size; i++){
            if (this.listData[i].equals(element)){
                index = i;
            }
        }
        return index;
    }
    /**Поиск элемента
     * @param element искомый элемент
     * @return 
     */
    public boolean find(Object element){
        boolean find = false;
        for (int i = 0; i < size; i++){
            if (this.listData[i].equals(element)){
                find = true;
                break;
            }
        }
        return find;
    }
    /** Увеличение длины массива на указанную величину
     * @param up величина на которую нужно удлинить массив
     */
    private void grow(int up){
        listData = Arrays.copyOf(listData, size+up);
    }
    /** Вывод в консоль длины массива*/
    public void length(){
        System.out.println(size);
    }
}