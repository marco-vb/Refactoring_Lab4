package pt.up.fe.ldts.example4;

import java.util.HashSet;
import java.util.Set;

public class Supervisor extends Worker {
    Set<Worker> supervisee;
    
    public Supervisor(String name, String phone, String username, String password) {
        super(name, phone, username, password);
        supervisee = new HashSet<>();
    }
    
    public void addSupervisee(Worker worker) {
        supervisee.add(worker);
    }

    public boolean isSupervisee(Worker worker) {
        return supervisee.contains(worker);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Supervisor that = (Supervisor) o;
        return supervisee.equals(that.supervisee);
    }
}
