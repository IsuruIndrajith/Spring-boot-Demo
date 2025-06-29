package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity means we made a table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private int id;
    private String name;
    private String address;

//    public User(int id, String name, String address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//    Using Lombok instead of above we can use @AllArgConstructor and @NoArgsconsrtutor
}
