package com.vikash.customer;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
