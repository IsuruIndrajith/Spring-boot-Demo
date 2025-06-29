package com.example.demo.repo;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{

//    a new method
    @Query(value = "SELECT * FROM USER WHERE ID = ?1", nativeQuery = true) // 1 means first arguement of the next row. ? is replaced by this 1st arguement of the next row
    User getUserByID(String userId);  // return type is of User

    @Query(value = "SELECT * FROM USER WHERE_ID =?1 AND ADDRESS=?2", nativeQuery = true)
    User getUserByUserIDAndAddress(String userID,String address);
}
