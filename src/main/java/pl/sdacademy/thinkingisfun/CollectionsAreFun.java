package pl.sdacademy.thinkingisfun;

import java.util.*;

public class CollectionsAreFun {

    public Collection<String> arrayListAdding() {
        Collection<String> strings = new ArrayList<>();
        strings.add("pierwszy");
        strings.add(null);
        strings.add(null);
        strings.add("drugi");
        strings.add("trzeci");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("piaty");
        return strings;
    }

    public Collection<String> hashSetAdding() {
        Collection<String> strings = new HashSet<>();
        strings.add("pierwszy");
        strings.add("drugi");
        strings.add(null);
        strings.add(null);
        strings.add("trzeci");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("piaty");
        return strings;
    }

    public Collection<String> treeSetAdding() {
        Collection<String> strings = new TreeSet<>();
        strings.add("pierwszy");
        strings.add("drugi");
        strings.add("trzeci");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("czwarty");
        strings.add("piaty");
        return strings;
    }
}
