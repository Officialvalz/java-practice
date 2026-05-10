
import java.util.*;

public class ArrayListCollection{

public static void main(String [] args){

ArrayList<String>collection1 = new ArrayList<>();

collection1.add("New york");
collection1.add("Dallas");
collection1.add("Atlanta");
collection1.add("Madison");
    System.out.println();

//Iterator <String> iterator = collection1.iterator();
//while(iterator.hasNext()) {
//    System.out.print(iterator.next().toUpperCase() + " ");
//}
//OR use foreach loop

for(String eachElement: collection1)
    System.out.print(eachElement.toUpperCase() + " ");

    System.out.println();

System.out.println(collection1.contains("Dallas"));
System.out.println(collection1.remove("Madison"));
System.out.println(collection1.size());

Collection <String> collection2 = new ArrayList<>();
collection2.add("Jos");
collection2.add("Abuja");
collection2.add("Lagos");
System.out.println(collection2);




ArrayList<String> newCollection = (ArrayList<String>) (collection1.clone());
newCollection.addAll(collection2);
System.out.println("Cities in collection1 and collection2: ");
System.out.println(newCollection);

newCollection = (ArrayList<String>) (collection1.clone());
newCollection.retainAll(collection2);
System.out.println("Cities in collection1 and collection2: ");
System.out.println(newCollection);

newCollection = (ArrayList<String>) (collection1.clone());
newCollection.removeAll(collection2);
System.out.println("Cities in collection1 but not in collection2: ");
System.out.println(newCollection);


}

}


