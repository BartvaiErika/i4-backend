package week12programming.Backery;

public class Payment  {

    private Integer day;
    private Double earning;
    private Double bankPayment;

    public Payment(Integer day, Double earning, Double bankPayment) {
        this.day = day;
        this.earning = earning;
        this.bankPayment = bankPayment;
    }

    public Integer getDay() {
        return day;
    }

    public Double getEarning() {
        return earning;
    }

    public Double getBankPayment() {
        return bankPayment;
    }


}
