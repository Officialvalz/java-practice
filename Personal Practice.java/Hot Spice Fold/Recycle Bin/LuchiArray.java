

import java.util.ArrayList;

public class LuchiArray {

    private final ArrayList<Integer> numbers;


    public LuchiArray() {

        numbers = new ArrayList<>();
    }

    public boolean isEmpty() {
        return numbers.isEmpty();
    }

    public void add(int value) {
        numbers.add(value);
    }

    public int get(int index){
        return numbers.get(index);
    }

    public boolean contains(int value) {
        return numbers.contains(value);
    }

    public int size(){
        return numbers.size();
    }
}







public class LuchiArray {

    private int [] array;
    private int size;

    public LuchiArray() {

        array = new int[10];
        size = 0;

    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int value) {
//        if(size == array.length){
//            resize();
//        }
        array[size] = value;
        size++;
    }

    public int get(int index){
        return array[index];
    }

    public boolean contains(int value) {

        for(int index = 0; index < size; index ++){
            if(array[index] == value){
                return true;
            }

        }
        return false;

    }


    public int length(){

        return size;
    }
//    public void resize(){
//        int [] newArray = new int [array.length * 2];
//
//        for(int index = 0; index < array.length; index++){
//            newArray[index] = array[index];
//        }
//        array = newArray;
//    }
}

