import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        VerbService verbService = VerbService.getInstance();
        List<Verb> verbList = verbService.getVerbs();
        System.out.println("All words:");
        verbList.forEach((v)->{
            System.out.println(v);
        });
        System.out.println();

        TreeSet<Verb> sortedVerbs = new TreeSet<>(
                Comparator.comparing((Verb verb) -> verb.getRusName()).thenComparing(Verb::getInfinitive)
        );

        sortedVerbs.addAll(verbList);

        Iterator<Verb> iterator = sortedVerbs.iterator();
        List<Verb> listS = new ArrayList<>();
        List<Verb> listT = new ArrayList<>();

        while (iterator.hasNext()){
            Verb next = iterator.next();
            if(next.getRusName().toLowerCase(Locale.ROOT).startsWith("с"))
                listS.add(next);

            if(next.getRusName().toLowerCase(Locale.ROOT).startsWith("т"))
                listT.add(next);
        }

        System.out.println("Первое слово с 'c' "+ listS.get(0).toString());
        System.out.println("Первое слово с 'т' "+ listT.get(0).toString());
        System.out.println();

        System.out.println("Все слова начинающиеся с 'с'");
        listS.forEach((Verb v)-> System.out.println(v));
        System.out.println();

        System.out.println("Все слова начинающиеся с 'т'");
        listT.forEach((Verb v)-> System.out.println(v));

//
    }
}
