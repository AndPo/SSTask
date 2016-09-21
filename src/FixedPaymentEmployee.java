/**
 * Created by ПК on 14.09.2016.
 */
public class FixedPaymentEmployee extends Employee {

    FixedPaymentEmployee( int id, String name, String surname){
        setId(id);
        setName(name);
        setSurname(surname);
        this.setSalary();
    }

    private static final int fixedMonthlyPayment = 4000;


    public void setSalary(){
        setSalary(fixedMonthlyPayment);
    }



}
