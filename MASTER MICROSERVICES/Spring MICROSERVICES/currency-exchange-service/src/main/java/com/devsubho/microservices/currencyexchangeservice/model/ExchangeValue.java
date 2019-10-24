package com.devsubho.microservices.currencyexchangeservice.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
// @AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class ExchangeValue {

    @NonNull
    @Id
    private Long id;

    @NonNull
    @Column(name="currency_from")
    private String from;

    @NonNull
    @Column(name="currency_to")
    private String to;

    @NonNull
    private BigDecimal conversionMultiple;

    private int port;
}
