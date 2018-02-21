package Exc12;

import java.util.*;

public class Exc12
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Bob");
        list.add("Bob");
        list.add("Bob");
        list.add("Henrik");
        list.add("Svend");
        list.add("Bent");


        System.out.println(contains3(list));
    }

    private static boolean contains3 (List<String> list)
    {
        Map<String, Integer> map = new HashMap<>();
        for (String s:list)
        {
            map.put(s, 0);
        }

        for (String s:list)
        {
            map.put(s, map.get(s) +1);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(map.values());
        for (int i = 0; i < list1.size(); i++)
        {
            if (list1.get(i) >= 3)
            {
                return true;
            }
        }
        return false;
    }
}
