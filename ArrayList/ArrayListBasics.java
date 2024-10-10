import java.util.ArrayList;
import java.util.Collections;
public class ArrayListBasics {
    public static void swap(ArrayList<Integer>list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        // ArrayList<String>list2 = new ArrayList<>();
        // ArrayList<Boolean>list3 = new ArrayList<>();
        //java collection framework
        //Operations
        //1.Add Element-> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // 2. Get element->O(1)
        int element = list.get(2);
        System.out.println(element);

        //3.Remove Element->O(n)
        list.remove(2);
        System.out.println(list);

        //4.Set element at Index -> O(n)
        list.set(2, 10);
        System.out.println(list);

        //5. Contains Element -> O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        //size of arraylist
        //.size()
        System.out.println(list.size());

        //Print the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Print Reverse of an Arraylist -> O(n)
        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //find maximum in an arraylist

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
        
        //swap 2 numbers in arraylist
        
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);

        //sorting on arraylist
         //increasing order
        Collections.sort(list);
        System.out.println(list);
        //decreasing order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}