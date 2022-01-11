import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(System.out::println);

        HashMap<Integer,Employee> hashmap = new HashMap<>();

        ListIterator<Employee> iterator = employees.listIterator();

        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(hashmap.containsKey(employee.getId())){
                iterator.remove();
            }else{
                hashmap.put(employee.getId(), employee);
            }
        }

        System.out.println("-------------------------------------------------");

        employees.forEach(System.out::println);

    }

    public static int hash(int value) {
        return Math.abs(value % 10);

    }

}
