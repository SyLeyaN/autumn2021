import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CsitCollector implements Collector<Student,List<Student>, List<String>> {

    @Override
    public Supplier<List<Student>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Student>, Student> accumulator() {
        return (list, student) ->list.add(student);
    }

    @Override
    public BinaryOperator<List<Student>> combiner() {
        return (list1, list2) ->{
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Student>, List<String>> finisher() {
        return (list) -> list.stream().filter(s -> s.getFaculty()==Faculty.CSIT)
                .map(Student::getName).collect(Collectors.toList());
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
