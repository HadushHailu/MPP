package lesson4.labs.partC.ext_pkg;

import lesson4.labs.partC.Employee;
import lesson4.labs.partC.Hourly;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hourly hourly = new Hourly("EMP4356");
        hourly.addHourlyEntry(100, 20, 2024, 1);
        hourly.addHourlyEntry(200, 20, 2024, 1);
        hourly.addHourlyEntry(300, 20, 2024, 1);

        hourly.calcGrossPay();
    }
}
