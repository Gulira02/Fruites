public class Banana extends Fruits{
    private String countries;


    VitaminBanana vitaminBanana=new VitaminBanana();

    public Banana(String name, String taste, String fruitVarieties, String countries, VitaminBanana vitaminBanana) {
        super(name, taste, fruitVarieties);
        this.countries = countries;
        this.vitaminBanana = vitaminBanana;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public VitaminBanana getVitaminBanana() {
        return vitaminBanana;
    }

    public void setVitaminBanana(VitaminBanana vitaminBanana) {
        this.vitaminBanana = vitaminBanana;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "countries='" + countries + '\'' +
                ", vitaminBanana=" + vitaminBanana +
                ", fruits=" + super.toString() +
                '}';
    }
}
