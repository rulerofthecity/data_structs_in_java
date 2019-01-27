import java.util.ArrayList;
import java.util.List;

public class Demo{

  public static void main(String[] args) throws CloneNotSupportedException{

    Employee emp = new Employee();
    emp.loadData();

    Employee emp1 = (Employee) emp.clone();

    Employee emp2 = (Employee) emp.clone();

    List<String> lst1 = emp1.getEmpList();
    lst1.add("ABC");
    lst1.add("PQR");

    System.out.println(emp1.getEmpList());

    List<String> lst2 = emp2.getEmpList();
    lst2.remove("Nadeem");

    System.out.println(emp2.getEmpList());


  }

}
