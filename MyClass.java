package kirill.generic;

public class MyClass<T extends Comparable> {

    private T max;
    private T min;
    //private T[] array;

//    public MyClass(T max, T min, T[] array) {
//        this.max = max;
//        this.min = min;
//        this.array = array;
//    }

    public MyClass(T max, T min) {
        this.max = max;
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    public T getMin() {
        return min;
    }

//    public T[] getArray() {
//        return array;
//    }

    public void setMax(T max) {
        this.max = max;
    }

    public void setMin(T min) {
        this.min = min;
    }

    //public void setArray(T[] array) {
    //    this.array = array;
    //}

    public int compareMax(MyClass<T> o) {
        return this.getMax().compareTo(o.getMax());
    }

    public int compareMin(MyClass<T> o) {
        return this.getMin().compareTo(o.getMin());
    }
//    public int compareMax(T a){
//        max.c
//    }
}
