package java2lesson4;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java2lesson3.Fifth;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {

    public static void main(String[] args) {
        System.out.println(reverse("java interview"));

        Integer[] list = {0,3,-1,-5,8};
        System.out.println(search(10,list));

        Integer[] list2 = {0,3,-1,-5,8};
        System.out.println(maximum(list2));

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(3);
        list3.add(5);
        System.out.println(average(list3));


        List<String> list4 = new ArrayList<>();
        list4.add("abc");
        list4.add("abcd");
        list4.add("ab");
        list4.add("aaa");
        System.out.println(search2(list4));



    }

    public static String reverse(String str) {
        Second second;
        second = (s) -> new StringBuilder(s).reverse().toString();
        return second.print(str);
    }

    public static int search(Integer n, Integer[] list){
        First first;
        first = (a, array) ->{
            int index = -1;
            int i = 0;
            while (index == -1 && i <array.length){
                if (array[i] == a){
                    index = array[i];
                }
                i++;
            }
            return index;
        };
        return  first.search(n, list);
    }

    public static int maximum(Integer[] list){
        Third third;
        third = (array) -> {
            int max = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] > max){
                    max = array[i];
                }
                i++;
            }
            return max;
        };
        return third.maximum(list);
    }

    public static Double average(List<Integer> list){
        Fourth fourth;
        fourth = (arrayList) -> {
            double ave = 0;
            for(Integer s : arrayList){
                ave = ave + s;
            }
            return ( ave/arrayList.size() );
        };
        return fourth.average(list);
    }

    private static List<String> search2(List<String> list){
        Fifth fifth;
        fifth = (array) -> {
            List<String> answer = new ArrayList<>();
            for(String s : array){
                if(s.charAt(0) == 'a' && s.length() == 3){
                    answer.add(s);
                }
            }
            return answer;
        };
        return fifth.search2(list);
    }
}
