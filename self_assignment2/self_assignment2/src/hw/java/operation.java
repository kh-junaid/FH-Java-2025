package hw.java;

import java.util.*;

//Simple operation class
class Operation {
 String name;
 double time;
 int agvsNeeded;
 double energy;
 
 public Operation(String name, double time, int agvsNeeded, double energy) {
     this.name = name;
     this.time = time;
     this.agvsNeeded = agvsNeeded;
     this.energy = energy;
 }
}
