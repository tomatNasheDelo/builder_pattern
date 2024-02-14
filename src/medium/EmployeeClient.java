package medium;


class Employee {

    private String name ;
    private String phoneNo;
    private int    age ;
    private String address;

   
    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    private Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.phoneNo = builder.phoneNo;
        this.address = builder.address;
        this.age = builder.age;
    }    
    
    
    @Override
    public String toString() {
         return "Employee{" +
            "name='" + name + '\'' +
            ", phoneNo='" + phoneNo + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
    }    
    
    
       public static class EmployeeBuilder{
        private String name;
        private String phoneNo;
        private int    age ;
        private String address;

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }
        public EmployeeBuilder age(int age) {
            this.age = age;
            return this;
        }
        public EmployeeBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }
        public EmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }
        
        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }
        
    }
}




public class EmployeeClient {
	
	
	
	public static void main(String[] args) {
    
 
  Employee.EmployeeBuilder builder = new    Employee.EmployeeBuilder();


    Employee employee1 = builder.
                            name("John").
                            age(26).
                            address("House no 123,gilbert street").
                            build();

    Employee employee2 = builder.
                            name("Rakesh").
                            age(24).
                            build();

    Employee employee3 = builder.
                            name("Mukesh").
                            age(27).
                            address("House no 123,gilbert street").
                            phoneNo("7676453321").build();    System.out.println(employee1);
                            
    System.out.println(employee2);
    System.out.println(employee3);
}
}