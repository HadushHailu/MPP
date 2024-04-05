package lesson4.labs.partC.ext_pkg;

import lesson4.labs.partC.*;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Hourly hourly = new Hourly("EMP4356");
        hourly.addHourlyEntry(100, 20, 2024, 1);
        hourly.addHourlyEntry(200, 20, 2024, 2);
        hourly.addHourlyEntry(300, 20, 2024, 3);

        //System.out.println(hourly.calcGrossPay(2024, 3));

        Salaried salaried = new Salaried("EMP7749");
        salaried.addSalariedEntry(23000, 2024, 3);

        Commissioned commissioned = new Commissioned("CM87973");
        CommissionedEntry ce = commissioned.addCommissionedEntry(1200, 0.5, 2024, 3);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);
        ce.addOrder("MIU79373", LocalDate.now(), 1000, 10.0);

        Employee employee = hourly;
        employee.print();

        Employee employee1 = salaried;
        employee1.print();

        Employee employee2 = commissioned;
        commissioned.print();
    }
}
