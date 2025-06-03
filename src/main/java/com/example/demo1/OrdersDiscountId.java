package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrdersDiscountId implements Serializable {
    private static final long serialVersionUID = -8018566453984189152L;
    @Column(name = "orderId", nullable = false)
    private Integer orderId;

    @Column(name = "discountId", nullable = false)
    private Integer discountId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersDiscountId entity = (OrdersDiscountId) o;
        return Objects.equals(this.orderId, entity.orderId) &&
                Objects.equals(this.discountId, entity.discountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, discountId);
    }

}