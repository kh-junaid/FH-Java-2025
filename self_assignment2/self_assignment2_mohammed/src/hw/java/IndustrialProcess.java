package hw.java;
import java.util.*;
class IndustrialProcess {
    String processName;
    ArrayList<Operation> operations;
    ArrayList<AGV> agvs;
    
    public IndustrialProcess(String name) {
        this.processName = name;
        this.operations = new ArrayList<>();
        this.agvs = new ArrayList<>();
    }
    
    public void addOperation(Operation op) {
        operations.add(op);
    }
    
    public void addAGV(AGV agv) {
        agvs.add(agv);
    }
    
    public void runProcess() {
        System.out.println("Starting process: " + processName);
        System.out.println("==============================");
        
        double totalTime = 0;
        double totalEnergy = 0;
        int maxAGVs = 0;
        
        for (Operation op : operations) {
            System.out.println("Running operation: " + op.name);
            System.out.println("Time needed: " + op.time + " minutes");
            System.out.println("AGVs needed: " + op.agvsNeeded);
            System.out.println("Energy used: " + op.energy + " kWh");
            
            
            int availableAGVs = 0;
            for (AGV agv : agvs) {
                if (agv.available) {
                    availableAGVs++;
                }
            }
            
            if (availableAGVs < op.agvsNeeded) {
                System.out.println("ERROR: Not enough AGVs!");
                return;
            }
            
            
            int usedAGVs = 0;
            for (AGV agv : agvs) {
                if (agv.available && usedAGVs < op.agvsNeeded) {
                    agv.available = false;
                    agv.battery -= (op.time * 1); 
                    usedAGVs++;
                }
            }
            
            
            totalTime += op.time;
            totalEnergy += op.energy;
            if (op.agvsNeeded > maxAGVs) {
                maxAGVs = op.agvsNeeded;
            }
            
          
            for (AGV agv : agvs) {
                agv.available = true;
            }
            
            System.out.println("Operation completed!");
            System.out.println("----------------------");
        }
        
        
        System.out.println("PROCESS COMPLETED: " + processName);
        System.out.println("Total time: " + totalTime + " minutes");
        System.out.println("Maximum AGVs used: " + maxAGVs);
        System.out.println("Total energy: " + totalEnergy + " kWh");
        System.out.println("Number of operations: " + operations.size());
        
        
        System.out.println("AGV status:");
        for (AGV agv : agvs) {
            System.out.println("AGV " + agv.id + " - Battery: " + agv.battery + "%");
        }
        System.out.println("==============================");
    }
}
