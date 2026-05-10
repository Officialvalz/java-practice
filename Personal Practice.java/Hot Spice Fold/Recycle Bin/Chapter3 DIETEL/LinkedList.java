import java.util.*;
public class LinkedList{
public static void main(String[] args){

List<Integer> arrayList = new ArrayList<>();
arrayList.add(1);
arrayList.add(2);
arrayList.add(3);
arrayList.add(4);
arrayList.add(5);
arrayList.add(6);
arrayList.add(7);

System.out.println("List of integers in the array List: ");
System.out.print(arrayList);

LinkedList<Object> linkedList = new LinkedList<>(arrayList);
linkedList.add(1, "red");
linkedList.removeLast();
linkedList.addFirst("green");


System.out.println("Display the Linked LIst forward: ");
ListIterator <Object> listIterator = linkedList.listIterator();
while(listIterator.hasNext()){
    System.out.println(listIterator.next() + " ");
}
System.out.println();
}
}
