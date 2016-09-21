import sun.plugin2.message.Serializer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by ПК on 14.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new FixedPaymentEmployee(1, "Nataly", "Grayskale"));
        employees.add(new HoyrlyRateEmployee(2, "Grey", "Joy"));
        employees.add(new HoyrlyRateEmployee(3, "Sansa", "Stark"));
        employees.add(new FixedPaymentEmployee(4, "Sally", "Jones"));
        employees.add(new FixedPaymentEmployee(5, "Ganine", "Sendle"));
        employees.add(new HoyrlyRateEmployee(6, "Ted", "Burns"));

        for (Employee emp: employees) {
            System.out.println(emp.toString());
            System.out.println(emp.getSalary());
        }
        // Problem A:
        Collections.sort(employees); // клас колекшн має свій метод для сортування, але для нього треба перевантажувати compareTo, equals i hashCode в класі, об'єкти якого сортуємо
                                    //  я перевантажив compareTo таким чином, щоб при однакових зарплатак двох працівників порівнював їх імена

        System.out.println("______________________________");
        for (Employee emp: employees) {
            System.out.println(emp.toString());
            System.out.println(emp.getSalary());
        }

        System.out.println("Problem B:~~~~~~~~~~~~~~~~~~~~~~~");
        //Problem B:
        for(int i = 0; i<5; i++){
            System.out.println(employees.get(i)); // аррейліст має метод гет, який повертає його елемент на вказаній позиції. цикл від 0 до 4, тому і виведе перші 5 елементів
        }
        System.out.println("");

        //Problem C:
        System.out.println("Problem C:++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("size: " + employees.size());
        for(int i = employees.size()-1; i>=employees.size()-3; i--){
            System.out.println(employees.get(i));
        }
        System.out.println("");

        //Problem D:
        System.out.println("--------------------------------------");

    }

}