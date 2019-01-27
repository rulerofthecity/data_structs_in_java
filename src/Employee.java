import java.util.ArrayList;
import java.util.List;

public class Employee{

  List<String> lst;

    public Employee(){
      lst = new ArrayList<String>();
    }

    public Employee(List<String> empList){
      this.lst = empList;
    }

    public void loadData(){
      lst.add("Nadeem");
      lst.add("Shoaib");
      lst.add("Shabana");
      lst.add("Naseem");
    }

    public List<String> getEmpList(){
      return this.lst;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
      List<String> temp = new ArrayList<String>();

      for(String s : this.getEmpList()){
        temp.add(s);
      }

      return new Employee(temp);

    }

}
