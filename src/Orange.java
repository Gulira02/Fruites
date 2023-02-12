public class Orange extends Fruits{
    private String countries;


    VitaminOranges vitaminOranges=new VitaminOranges();

    public Orange(String name, String taste, String fruitVarieties, String countries, VitaminOranges vitaminOranges) {
        super(name, taste, fruitVarieties);
        this.countries = countries;
        this.vitaminOranges = vitaminOranges;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public VitaminOranges getVitaminOranges() {
        return vitaminOranges;
    }

    public void setVitaminOranges(VitaminOranges vitaminOranges) {
        this.vitaminOranges = vitaminOranges;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "countries='" + countries + '\'' +
                ", vitaminOranges=" + vitaminOranges +
                ", fruits=" + super.toString() +
                '}';
    }

}
