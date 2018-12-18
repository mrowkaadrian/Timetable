import java.math.BigDecimal;

public class MoneyItem extends Item {
    private String money_from;
    private String money_to;

    MoneyItem() {

    }

    public String getMoney_from() {
        return money_from;
    }

    public void setMoney_from(String money_from) {
        this.money_from = money_from;
    }

    public String getMoney_to() {
        return money_to;
    }

    public void setMoney_to(String money_to) {
        this.money_to = money_to;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    private BigDecimal value;


}
