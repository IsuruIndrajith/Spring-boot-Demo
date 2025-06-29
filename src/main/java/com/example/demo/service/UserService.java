package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;  //UserRepo mekata inject kra gnnava

//        UserControl eke request eka DTO --> Entity --> Service layer --> then send it to the repository
//        DTO eke tika Entity ekata map kra ganna oni.
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO){   //Entity hraha thamai data save kranne, namut user data enne DTO hraha
        userRepo.save(modelMapper.map(userDTO, User.class));
        //userDTO kiyana eka save krnva
        return userDTO;
    }

    public List<UserDTO> getAllUsers(){
        List<User>userList=userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

    //Using Native querry to filter users.
//    User id > user details
//    select * from user where id = 2
    public UserDTO getUserByID(String userID){
        User user = userRepo.getUserByID(userID);
        return modelMapper.map(user, UserDTO.class);
    }




//    user id, address > user details
//    select * from user where id=2 and address = "Oracle"
}
