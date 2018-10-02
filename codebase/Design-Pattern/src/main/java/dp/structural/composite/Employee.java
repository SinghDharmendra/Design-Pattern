package dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
   private String name;
   private String dept;
   private int salary;
   List<Employee> subordinates;

   public Employee(String name, String dept, int salary) {
      this.name = name;
      this.dept = dept;
      this.salary = salary;
      this.subordinates = new ArrayList<>();
   }

   public void add(Employee e) {
      subordinates.add(e);
   }

   public void remove(Employee e) {
      subordinates.remove(e);
   }

   @Override
   public String toString() {
      return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinates=" + subordinates + "]";
   }

   public List<Employee> getSubordinates() {
      return subordinates;
   }

}
