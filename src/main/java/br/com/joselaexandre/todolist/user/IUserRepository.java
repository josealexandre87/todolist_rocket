package br.com.joselaexandre.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserRepository extends JpaRepository<UserModel, UUID>{ // interface é um contrato, mas não faz a implementação dos métodos.
    
    UserModel findByUsername(String username);
}
