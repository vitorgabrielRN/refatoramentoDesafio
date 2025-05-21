package r.m.k.desafio.remake.Model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;




@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name ="clients")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private String email;
    
    private int cpf;
    
    private String address;
    
    private String Number;

    
    
    public Client(){
    }

    
    
 
}
