import Model.Bug;

public class App {

    public static void main(String[] args){

        Bug report = new Bug("Znaleziono blad nr 505. Brak dodatkowych danych.", "martyna@gmail.com", 3);

        report.getAllInfo();
        report.getEmail();
        report.showStatus();
        int reportPoint = report.getPoint();
        System.out.println(reportPoint);

    }
}
