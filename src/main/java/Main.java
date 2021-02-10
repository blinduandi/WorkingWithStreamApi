import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

class Main {



     private static Person[] arrayOfPers = {
             new Person("Maria",14.5f, LocalDate.of(1924,1,15), Person.Gender.Female),
             new Person("Ioana",13.5f, LocalDate.of(1998,5,19), Person.Gender.Female),
             new Person("Andreia",12.5f, LocalDate.of(1975,9,2), Person.Gender.Female),
             new Person("Gheorhe",14.5f, LocalDate.of(1974,12,4), Person.Gender.Male),
             new Person("Ion",13.5f, LocalDate.of(1996,10,1), Person.Gender.Male),
             new Person("Andrei",12.5f, LocalDate.of(1989,11,23), Person.Gender.Male)
     };



     public static void main(String[] args) {

         Stream.of(arrayOfPers);
         ArrayList<Person> array = new ArrayList<>();
         array.stream();
        show(arrayOfPers);

         List<String> names = array.stream()
                 .map(arrayOfPers -> arrayOfPers.getName())
                 .collect(Collectors.toList());


         List<String> females = array.stream()
                 .filter(person -> person.getGenderr() == Person.Gender.Female)
                 .map(female -> female.getName())
                 .collect(Collectors.toList());


         Map<Person.Gender, List<Person>> people = array.stream()
                 .collect(Collectors.groupingBy(p -> p.getGenderr()));


         DoubleStream salaries = array.stream().mapToDouble(e -> e.getSalary());
         double average = salaries.average().orElse(-1);
         double sum = salaries.sum();

         Float sum2 = array.stream().map(e -> e.getSalary()).reduce((float) 0.0, (s1, s2) -> (s1 + s2));


         String empNames = array.stream()
                 .map(e -> e.getName())
                 .collect(Collectors.joining(", "));

         DoubleSummaryStatistics stats = array.stream()
                 .collect(Collectors.summarizingDouble(e -> e.getSalary()));
         stats.getAverage();
         stats.getCount();
         stats.getMax();
         stats.getMin();
         stats.getSum();




     }

    static void show(Person[] arrayOfPers) {
        for (Person value : arrayOfPers) {

            System.out.println(value.name);
            System.out.println(value.salary);
            System.out.println(value.birthdate);
            System.out.println(value.genderr);
            System.out.println("****************");

        }
    }





}
