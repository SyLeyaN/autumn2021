import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;


public class VerbService {
    private static final VerbService instance = new VerbService();
    private final List<Verb> verbs = new ArrayList<>();
    public final String PATH = "E:/Код/Netcracker/autumn2021/08.11.21Verb/Resource/file.txt";

    private VerbService(){
        try(Scanner scanner = new Scanner(new File(PATH))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] string = line.split(";");
                Verb verb = new Verb(string[0], string[1], string[2],string[3]);
                verbs.add(verb);
            }
            Collections.shuffle(verbs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static VerbService getInstance(){
        return instance;
    }

    public List<Verb> getVerbs( ){
        return Collections.unmodifiableList(verbs);
    }
}
