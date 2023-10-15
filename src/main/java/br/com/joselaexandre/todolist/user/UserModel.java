package br.com.joselaexandre.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID; // import do UUID

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; // Anotation @Entity
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;

/* Lombok é uma lib JAVA usando Maven que contem anotations que 
facilitam a criação de GETTERS e SETTERS no Model(Banco de Dados).

@Data => vai colocar os Getters e Setters em todos os Atributos
@Getter => vai colocar apenas os gets
@Setter => vai colocar apenas os sets */

@Data
@Entity(name = "tb_users") // A Anotation @Entity cria o nome da Tabela
public class UserModel {
    
    @Id // Anotation informa q o atributo id será nossa Primary Key(PK).
    @GeneratedValue(generator = "UUID") // gera automáticamente o ID usando  UUID.
    private UUID id; // UUID é um gerador de identificação única.

  //@Column(name = "usuario") //Faz o jakarta criar um nome no banco de dados para a coluna username.
    @Column(unique = true) // Cria uma Constraint (uma restrição). Diz que o username tem que ter o valor único. Não deixa criar o mesmo username.
    private String username;
    private String name;
    private String password;
    
    @CreationTimestamp // cria o data/hora de quando o dado foi gerado.
    private LocalDateTime createdAt;

}