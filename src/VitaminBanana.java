public class VitaminBanana {


    private String vitaminsBananas;

    public VitaminBanana(String vitaminsBananas) {
        this.vitaminsBananas = vitaminsBananas;
    }
    public VitaminBanana(){}



    public String getVitaminsBananas() {
        return vitaminsBananas;
    }

    public void setVitaminsBananas(String vitaminsBananas) {
        this.vitaminsBananas = vitaminsBananas;
    }

    @Override
    public String toString() {
        return "VitaminBanana{" +
                "vitaminsBananas='" + vitaminsBananas + '\'' +
                '}';
    }
}
