package hw.java;
import java.util.*;

public class SimpleWarehouse {
    public static void main(String[] args) {
        
        // Create some AGVs
        AGV agv1 = new AGV("AGV001");
        AGV agv2 = new AGV("AGV002");
        AGV agv3 = new AGV("AGV003");
        
        // Create first process
        IndustrialProcess process1 = new IndustrialProcess("Order Process 1");
        
        // Add AGVs to process
        process1.addAGV(agv1);
        process1.addAGV(agv2);
        process1.addAGV(agv3);
        
        // Add operations to process
        process1.addOperation(new Operation("Loading", 10.0, 2, 5.0));
        process1.addOperation(new Operation("Transport", 15.0, 1, 3.0));
        process1.addOperation(new Operation("Unloading", 8.0, 2, 2.0));
        
        // Run the process
        process1.runProcess();
        
        // Create second process
        IndustrialProcess process2 = new IndustrialProcess("Order Process 2");
        
        // Reuse the same AGVs
        process2.addAGV(agv1);
        process2.addAGV(agv2);
        process2.addAGV(agv3);
        
        // Add different operations
        process2.addOperation(new Operation("Loading", 12.0, 3, 6.0));
        process2.addOperation(new Operation("Transport", 20.0, 2, 4.0));
        process2.addOperation(new Operation("Unloading", 10.0, 2, 3.0));
        
        // Run second process
        process2.runProcess();
        
        // Simple summary
        System.out.println("ALL PROCESSES COMPLETED!");
        System.out.println("3 AGVs were used for both processes");
    }
}