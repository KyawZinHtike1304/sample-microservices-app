package com.example.webui.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private int id;
    private String code;
    private String name;
    private String country;
}
