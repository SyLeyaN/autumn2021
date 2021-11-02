
public class Main {
    public static void main(String[] args) throws Exception {
        SeasonService seasonService = new SeasonService();

        seasonService.showSeason(Month.APRIL);
        seasonService.showSeason(Month.JANUARY);
        seasonService.showSeason(Month.AUGUST);
        seasonService.showSeason(Month.OCTOBER);
    }
}
