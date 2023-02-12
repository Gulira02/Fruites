public class Apple extends Fruits{
    private String countries;
    VitaminApples vitaminApples=new VitaminApples();

    public Apple(String name, String taste, String fruitVarieties, String countries, VitaminApples vitaminApples) {
        super(name, taste, fruitVarieties);
        this.countries = countries;
        this.vitaminApples = vitaminApples;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public VitaminApples getVitaminApples() {
        return vitaminApples;
    }

    public void setVitaminApples(VitaminApples vitaminApples) {
        this.vitaminApples = vitaminApples;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "countries='" + countries + '\'' +
                ", vitaminApples=" + vitaminApples +
                ", fruits=" + super.toString() +
                '}';
    }

}
