package CompanyStructure;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private String location;
    private AccountingStandard AccoutSt;
    private List<Boss> bosses;

    public Company(String name, String location, AccountingStandard AccoutSt) {
        this.name = name;
        this.location = location;
        this.AccoutSt = AccoutSt;
        this.bosses = new ArrayList<>();

    }

    public void addBoss(Boss boss){
        bosses.add(boss);
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {  
        return name + ", " + location + ", " + AccoutSt + ", " + AmountofEmployees() + " employees.";
    }

    private String AmountofEmployees() {
        String help = "";
        int bossAmount = bosses.size();
        int totSum = bossAmount;
        for (Boss bossen : bosses) {
            totSum = totSum + bossen.amountofEmployees();

        }
        return help +totSum;
    }

}
