package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDiscountId implements Serializable {
    private static final long serialVersionUID = -8018566453984189152L;
    @Column(name = "order_id", nullable = false)
    private int orderId;

    @Column(name = "discount_id", nullable = false)
    private int discountId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDiscountId entity = (OrderDiscountId) o;
        return Objects.equals(this.orderId, entity.orderId) &&
                Objects.equals(this.discountId, entity.discountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, discountId);
    }

}