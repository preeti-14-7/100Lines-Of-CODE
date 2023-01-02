import java.util.ArrayList;

class Main{
     
     class Employee{
        private String name;
        private String phone;
        private int empId;

        public Employee(String name, String phone, int empId)
        {
            this.name = name;
            this.phone = phone;
            this.empId = empId;
        }

        public String getName()
        {
            return name;
        }
        
        public String getPhone()
        {
            return phone;
        }

        public int getEmpId()
        {
            return empId;
        }
    }
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<>();

        emps.add(new Employee("Durgesh","124563",12));
    }
};