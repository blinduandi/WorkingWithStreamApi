import java.time.LocalDate;

//Adăugați clasa Person
//Câmpuri: name, salary, gender (enum), birthdate (localdate)
public class Person {
    String name;
    float salary;
    enum Gender{
        Male,
        Female
    };
    LocalDate birthdate;
    Gender genderr;

    Person(String name,float salary,LocalDate birthdate,Gender gender ){
        this.name=name;
        this.salary=salary;
        this.birthdate=birthdate;
         this.genderr= gender;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public Gender getGenderr() {
        return genderr;
    }
}
