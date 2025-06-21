package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderSubscriptionId implements Serializable {
    private static final long serialVersionUID = -3607508002503065242L;
    @Column(name = "subscription_id", nullable = false)
    private int subscriptionId;

    @Column(name = "order_id", nullable = false)
    private int orderId;

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderSubscriptionId entity = (OrderSubscriptionId) o;
        return Objects.equals(this.orderId, entity.orderId) &&
                Objects.equals(this.subscriptionId, entity.subscriptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, subscriptionId);
    }

}