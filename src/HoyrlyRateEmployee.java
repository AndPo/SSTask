/**
 * Created by ПК on 14.09.2016.
 */
public class HoyrlyRateEmployee extends Employee{

    private static final float hourlyRate = 8.5f;

    HoyrlyRateEmployee(int id, String name, String surname){
        setId(id);
        setName(name);
        setSurname(surname);
        setSalary(20.8f * 8 * hourlyRate);
    }

}
