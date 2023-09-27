package Homework_ArrayList;
// 1) size()  - метод, аналогичный методу size() из обычного arrayList - он возвращет реальный размер листа
// 2) add(index, value) - метод add, только который вставляет значение не в конец списка, а в любое произвольное место (место задается переменной index)
// 3) remove(int index) - аналог remove из классического ArrayList - удаляет элемент из листа по индексу
public class ArrayList {
    private int[] array;
    private ArrayList[] data;
    private int size;

    public ArrayList() {
        array = new int[100];
        size = 0;
    }

    public int size() {
        return size;
    }


    public void add(int index, ArrayList value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == data.length) {
            ArrayList[] newData = new ArrayList[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = value;
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
        data[size] = null;

    }
}

