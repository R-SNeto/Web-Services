package com.github.r_sneto.WebServices.entities.pk;

import com.github.r_sneto.WebServices.entities.Order;
import com.github.r_sneto.WebServices.entities.Product;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        OrderItemPK orderItemPK = (OrderItemPK) object;
        return Objects.equals(order, orderItemPK.order) && Objects.equals(product, orderItemPK.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }
}
