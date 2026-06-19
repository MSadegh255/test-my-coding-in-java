import java.util.Objects;

public class Controller extends Employee {
    private static int nControllers;
    private int nEmployeesInControl;

    public Controller(int baseSallary, int nEmployeesInControl) {
        super(baseSallary, 20);
        // if (nEmployeesInControl <= 0) throw new IllegalArgumentException("The number must be more than zero.");
        this.nEmployeesInControl = nEmployeesInControl;
        nControllers++;
    }
    
    public static int getnControllers() {
        return nControllers;
    }
    
    public int getNEmployeesInContorol() {
        return this.nEmployeesInControl;
    }
    
    @Override
    public String toString() {
        return new String("I am controller.");
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Controller) {
            var controller = (Controller)obj;
            return Objects.hash(this.nEmployeesInControl) == Objects.hash(controller.nEmployeesInControl);
        }
        else if (obj instanceof Employee) {
            Employee emp = (Employee)obj;
            return this.getBaseSallary() == emp.getBaseSallary();
        }
        return false;
    }


    // @Override
    public void firedController() throws ControllerException {
        if (this.nEmployeesInControl == 0) 
            throw new ControllerException("hey!", new CanNotFireException("hoy!"));
        
        System.out.println("I lost my employees");
    }

    
}
