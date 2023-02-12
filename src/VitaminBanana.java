public class Vitamin {
    private String vitaminsApples;
    private String vitaminsOrange;
    private String vitaminsBananas;

    public Vitamin(String vitaminsApples, String vitaminsOrange, String vitaminsBananas) {
        this.vitaminsApples = vitaminsApples;
        this.vitaminsOrange = vitaminsOrange;
        this.vitaminsBananas = vitaminsBananas;
    }
    public Vitamin(){}

    public String getVitaminsApples() {
        return vitaminsApples;
    }

    public void setVitaminsApples(String vitaminsApples) {
        this.vitaminsApples = vitaminsApples;
    }

    public String getVitaminsOrange() {
        return vitaminsOrange;
    }

    public void setVitaminsOrange(String vitaminsOrange) {
        this.vitaminsOrange = vitaminsOrange;
    }

    public String getVitaminsBananas() {
        return vitaminsBananas;
    }

    public void setVitaminsBananas(String vitaminsBananas) {
        this.vitaminsBananas = vitaminsBananas;
    }
}
