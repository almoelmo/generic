package kirill.generic;

public class task1 {
    public static void main(String[] args) {
        Integer[] array = {10, 9, 8, 7, 6, 1, 2, 3, 4, 5};
        MyClass<Integer> myClass = findMaxAndMin(array);
        System.out.println(myClass.getMax() + " " + myClass.getMin());
    }

//    public static <T extends Comparable> MyClass<T> find(T[] mas){
//        MyClass<T> temp = new MyClass<T>(mas[0], mas[0]);
//        for (int i = 0; i < mas.length; i++) {
//            if(temp.c > 0)
//        }
//    }



    public static <T extends Comparable<T>> MyClass<T> findMaxAndMin(T[] mas){
        MyClass<T> temp = new MyClass<T>(mas[0], mas[0]);
        for (int i = 0; i < mas.length; i++) {
            if(temp.compareMax((MyClass<T>) mas[i]) > 0){
                temp.setMax(mas[i]);
            }
            if(temp.compareMin((MyClass<T>) mas[i]) > 0){
                temp.setMin(mas[i]);
            }
        }
        return temp;
    }
}
