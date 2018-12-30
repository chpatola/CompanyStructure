package CompanyStructure;

public class Individual {

    private String name;
    private int birthyear;
    private String title;

    public Individual(String name, int birthyear, String title) {
        this.name = name;
        this.birthyear = birthyear;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
    

    @Override
    public String toString() {
        return name + ", born " + birthyear + ", "+ title+"\n";
    }

}
