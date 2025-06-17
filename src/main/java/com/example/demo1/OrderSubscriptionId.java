package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderSubscriptionId implements Serializable {
    private static final long serialVersionUID = -3607508002503065242L;
    @Column(name = "subscription_id", nullable = false)
    private Integer subscriptionId;

    @Column(name = "order_id", nullable = false)
    private Integer orderId;

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
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