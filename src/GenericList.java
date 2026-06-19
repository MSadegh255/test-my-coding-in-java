public class GenericList<T> {
    private T[] list = (T[])new Object[12];
    private int counter;

    public GenericList(T[] list, int counter) {
        this.list = list;
        this.counter = counter;
    }

    public void add(T a) {
        list[counter++] = a;
    }

    public T getFromIndex(int index) {
        return list[index];
    }

    public void printLength() {
        System.out.println(this.list.length);
    }
}
