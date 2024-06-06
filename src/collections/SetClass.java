package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(9);
        hashSet.add(7);
        hashSet.add(91);
        hashSet.add(71);
        hashSet.add(93);
        hashSet.add(7);

        for (int num:hashSet  ) {
            System.out.println(num);
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(9);
        linkedHashSet.add(7);
        linkedHashSet.add(91);
        linkedHashSet.add(71);
        linkedHashSet.add(93);
        linkedHashSet.add(7);

        System.out.println("***********");
        for (int num:linkedHashSet  ) {
            System.out.println(num);
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(91);
        treeSet.add(71);
        treeSet.add(93);
        treeSet.add(7);

        System.out.println("***********");
        for (int num:treeSet  ) {
            System.out.println(num);
        }

    }
}