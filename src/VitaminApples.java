public class VitaminApples {
    private String vitaminsApples;

    public VitaminApples(String vitaminsApples) {
        this.vitaminsApples = vitaminsApples;
    }
    public VitaminApples(){}

    public String getVitaminsApples() {
        return vitaminsApples;
    }

    public void setVitaminsApples(String vitaminsApples) {
        this.vitaminsApples = vitaminsApples;
    }

    @Override
    public String toString() {
        return "VitaminApples{" +
                "vitaminsApples='" + vitaminsApples + '\'' +
                '}';
    }
}
