package CompanyStructure;

public class Main {

    public static void main(String[] args) {
        Individual Kalle = new Individual("Kalle", 1987, "seller");
        Individual Kalles = new Individual("Kalles", 1989, "customer service rep");
        Individual Kallena = new Individual("Kallena", 1983, "sales assistant");

        System.out.println(Kalle);

        Boss Bosse = new Boss("Bosse", 1966, Team.FINLAND, "country manager finland");
        Bosse.addEmployee(Kallena);
        Bosse.addEmployee(Kalle);
        Bosse.addEmployee(Kalles);
        System.out.println(Bosse.toString());

        Individual Manda = new Individual("Manda", 1988, "seller");
        Individual Madde = new Individual("Madde", 1989, "marketing coordinater");
        Boss Bosselina = new Boss("Bosselina", 1977, Team.SWEDEN, "country manager sweden");
        Bosselina.addEmployee(Madde);
        Bosselina.addEmployee(Manda);
        System.out.println(Bosselina.toString());

        Company coolcompany = new Company("CoolCompany", "Amsterdam", AccountingStandard.IFRS);
        coolcompany.addBoss(Bosse);
        coolcompany.addBoss(Bosselina);
        System.out.println( coolcompany.toString());
       

    }

}
