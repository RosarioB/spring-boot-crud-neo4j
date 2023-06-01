package com.rosariob.crud.neo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

import java.util.List;

@Getter @Setter @AllArgsConstructor @ToString
public class Roles{

    @Id
    @GeneratedValue
    private long id;

    @Property("roles")
    private List<String> roles;
}
