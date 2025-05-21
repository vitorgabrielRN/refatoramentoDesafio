package r.m.k.desafio.remake.Controller;

import java.lang.reflect.Executable;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import r.m.k.desafio.remake.Model.Client;
import r.m.k.desafio.remake.Model.DadosCadastrosClient;
import r.m.k.desafio.remake.Repository.ClientRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("clients")
public class ClientController {
    @Autowired
    private ClientRepository repository;

    @PostMapping // cadastrar
    @Transactional
    public ResponseEntity<Client> cadastrar(@RequestBody DadosCadastrosClient client) {
        try {
            repository.save(new Client());
            System.out.println(client);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            System.out.println("ERRO:" + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    

}
