public class VitaminOranges {
    private String vitaminsOrange;

    public VitaminOranges(String vitaminsOrange) {
        this.vitaminsOrange = vitaminsOrange;
    }
    public VitaminOranges(){}

    public String getVitaminsOrange() {
        return vitaminsOrange;
    }

    public void setVitaminsOrange(String vitaminsOrange) {
        this.vitaminsOrange = vitaminsOrange;
    }

    @Override
    public String toString() {
        return "VitaminOranges{" +
                "vitaminsOrange='" + vitaminsOrange + '\'' +
                '}';
    }
}
