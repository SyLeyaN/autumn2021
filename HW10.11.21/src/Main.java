import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      Stream.of(
                new Student("Ivan", 18, Faculty.CSIT),
                new Student("Igor", 19, Faculty.BIOLOGY),
                new Student("Masha", 20, Faculty.ECONOMIST),
                new Student("Nastya", 21, Faculty.CSIT),
                new Student("Anna", 22, Faculty.PE),
                new Student("Vika", 23, Faculty.BIOLOGY),
                new Student("Alexander", 24, Faculty.ECONOMIST),
                new Student("Vlad", 150, Faculty.CSIT)
        ).collect(new CsitCollector()).forEach(System.out::println);


    }
}
