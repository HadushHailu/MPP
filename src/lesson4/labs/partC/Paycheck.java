package lesson4.labs.partC;

public final class Paycheck {
    private double grossPay;
    private double state;
    private double fica;
    private double local;
    private double medicare;
    private double socialSecurity;

    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", state=" + state +
                ", fica=" + fica +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                '}';
    }

    public Paycheck(double grossPay){
        this.grossPay = grossPay;
        this.fica = grossPay * 0.23;
        this.local = grossPay * 0.01;
        this.state = grossPay * 0.05;
        this.medicare = grossPay * 0.03;
        this.socialSecurity = grossPay * 0.075;
    }

}
