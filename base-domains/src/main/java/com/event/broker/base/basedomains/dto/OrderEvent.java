package com.event.broker.base.basedomains.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderEvent {
    private String message;
    private String status;
    private Order order;

}
