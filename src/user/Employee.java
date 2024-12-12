package user;

public class Employee {

    String name;
    int salary;

        public void setName(String name){
        this.name = name;
    }
    public String  getName(){
        return name;

    }
        public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;

    }

        public static void main(String[] args) {
        Employee name = new Employee();
        name.setName("Esger");
        System.out.println(name.getName());

        Employee salary = new Employee();
        int a = 4450;
        if (a<0){
            a = 0;
        }
        salary.setSalary(a);
        System.out.println(salary.getSalary());



    }


}
