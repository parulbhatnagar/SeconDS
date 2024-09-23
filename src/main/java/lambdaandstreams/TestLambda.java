package lambdaandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestLambda {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = Arrays.asList(
                new Employee("Parul",2500000, 'M'),
                new Employee("Neevan",3000000, 'M'),
                new Employee("Niha",2000000, 'F'),
                new Employee("test",1200000, 'M'),
                new Employee("check",250000000, 'F')
        );

        Predicate<Employee> predicate = employee -> employee.getGender()=='M';

        Function<Employee,String> function = employee -> employee.name;

        Consumer<Employee> consumer = employee -> System.out.println(employee);

        Supplier<Employee> supplier = () -> new Employee();

        listOfEmployees.stream().filter(predicate).forEach(consumer);

        listOfEmployees.stream().map(function).forEach(s -> System.out.println(s));

        Employee employee = supplier.get();


        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        listOfNumbers.stream().filter(integer -> integer%2==0).forEach(integer -> System.out.println(integer));

        var evenListOfNmumbers = listOfNumbers.stream().filter(integer -> integer%2==0).collect(Collectors.toList());

        System.out.println(evenListOfNmumbers);
    }
}
