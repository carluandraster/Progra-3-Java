import Modelo.*;
import Modelo.Monitores.*;

public class Main {
    public static void main(String[] args) {
        MonitorCaso3 monitor = new MonitorCaso3();

        new Tren("Tren A", monitor, false).start();
        new Tren("Tren B", monitor, true).start();
        new Tren("Tren C", monitor, false).start();
    }
}