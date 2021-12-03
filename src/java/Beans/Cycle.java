package Beans;

public class Cycle {
    
    private int IdCycle;
    private String Cycle;

    public Cycle() {
    }

    public Cycle(int IdCycle, String Cycle) {
        this.IdCycle = IdCycle;
        this.Cycle = Cycle;
    }

    public int getIdStartCycle() {
        return IdCycle;
    }

    public void setIdStartCycle(int IdCycle) {
        this.IdCycle = IdCycle;
    }

    public String getCycle() {
        return Cycle;
    }

    public void setCycle(String Cycle) {
        this.Cycle = Cycle;
    }
    
    
}
