package com.example.departmentservice.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Data
public class Departments {
    private List<Department> departments;

    public Departments() {

    }
    public Departments(Spliterator<Department> spliterator){
        departments = StreamSupport
                .stream(spliterator,false)
                .collect(Collectors.toList());
    }
}
