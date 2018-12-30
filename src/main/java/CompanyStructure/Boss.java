package CompanyStructure;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Individual {

    private Team team;
    private List<Individual> employees;

    public Boss(String name, int birthyear, Team team, String title) {
        super(name, birthyear, title);
        this.team = team;
        this.employees = new ArrayList<>();
    }
    public void addEmployee(Individual individual){
        employees.add(individual);
    }
    

    public int amountofEmployees() {
        return employees.size();
    }
    

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        employees.stream().forEach(e -> st.append(e));
        return "Employees under boss " + getName()+" ("+getTitle()+"):\n"+ st.toString();
    }

}
