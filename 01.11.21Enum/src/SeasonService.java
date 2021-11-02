import javax.sound.midi.Soundbank;
import java.util.EnumMap;
import java.util.concurrent.Callable;

public class SeasonService {

    private EnumMap<Month,Callable<Season>> enumMap;

    SeasonService(){
    enumMap = new EnumMap<>(Month.class);
        for (Month month: Month.values()) {
            switch (month.ordinal()){
                case (0):
                    enumMap.put(month,() -> Season.WINTER);
                    break;
                case (1):
                    enumMap.put(month,() -> Season.WINTER);
                    break;
                case (11):
                    enumMap.put(month,() -> Season.WINTER);
                    break;
                case (2):
                    enumMap.put(month,() -> Season.SPRING);
                    break;
                case (3):
                    enumMap.put(month,() -> Season.SPRING);
                    break;
                case (4):
                    enumMap.put(month,() -> Season.SPRING);
                    break;
                case (5):
                    enumMap.put(month,() -> Season.SUMMER);
                    break;
                case (6):
                    enumMap.put(month,() -> Season.SUMMER);
                    break;
                case (7):
                    enumMap.put(month,() -> Season.SUMMER);
                    break;
                case (8):
                    enumMap.put(month,() -> Season.AUTUMN);
                    break;
                case (9):
                    enumMap.put(month,() -> Season.AUTUMN);
                    break;
                case (10):
                    enumMap.put(month,() -> Season.AUTUMN);
                    break;
            }
        }
    }

    void showSeason(Month month) throws Exception{
        Season season = enumMap.get(month).call();
        System.out.printf(season.getDescription());
    }
}
