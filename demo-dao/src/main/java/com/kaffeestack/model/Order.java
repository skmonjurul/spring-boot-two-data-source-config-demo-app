package com.kaffeestack.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;



@Getter
@Setter
@ToString
@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    private static final long serialVersionUID = 6251973609906801990L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, name = "order_id")
    private String orderId;

    @Column(name = "bill_no")
    private String billNo;

    @Column(name = "organization_id")
    private Integer organizationId;

    @Column(name = "cart_id")
    private String cartId;

    @Column(name = "customer_id")
    private Long customerId;

}
