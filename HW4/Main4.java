package HW4;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> listWords = new ArrayList<>();
        listWords.add("Apple");
        listWords.add("Banana");
        listWords.add("Cat");
        listWords.add("Dream");
        listWords.add("Eys");
        listWords.add("Apple");
        listWords.add("Chair");
        listWords.add("Eys");
        listWords.add("Table");
        listWords.add("Birds");
        listWords.add("Cat");
        listWords.add("Chair");
        listWords.add("Pen");
        listWords.add("Apple");
        listWords.add("Table");
        listWords.add("Chair");
        listWords.add("Banana");
        System.out.println("Список всех слов:");
        for (String temp : listWords) {
            System.out.println(temp);
        }

        Map<String, Integer> countWords = new HashMap<String,Integer>();
        System.out.println("Список уникальных слов");

        int m = 1;

        for (int i = 0; i < listWords.size(); i++) {
            int count = 1;
            for (int j = m; j < listWords.size(); j++) {
                if (listWords.get(i) == listWords.get(j)) {
                    listWords.remove(j);
                    count++;
                }
                countWords.put(listWords.get(i), count);
            }
            m++;
         }

        for (Map.Entry<String, Integer> o : countWords.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }



    }
}

