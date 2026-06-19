public class Employee {
    private static int nEmployees;
    private String name;
    
    private int baseSallary;
    
    private int hourlySpent;
    private int hourMore;

    public Employee(int baseSallary, int hourlySpent) {
        this.baseSallary = baseSallary;
        this.hourlySpent = hourlySpent;
        nEmployees++;
    }
    
    public Employee(int hourlySpent) {
        this.baseSallary = 0;
        this.hourlySpent = hourlySpent;
        nEmployees++;
    }
    
    public static int getnEmployees() {
        return nEmployees;
    }
    
    public void setName(String name) {
        // if (name.trim() == "") throw new IllegalArgumentException("Empty name is invalid.");
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setHourMore(int hourMore) {
        this.hourMore = hourMore;
    }

    public int calculateSalary() {
        return baseSallary + (hourMore * hourlySpent);
    }

    @Override
    public String toString() {
        return new String("I am employee.");
    }

    public void fired() {
        System.out.println("I lost my money.");
    }
    
    public int getBaseSallary() {
        return baseSallary;
    }
    
}
