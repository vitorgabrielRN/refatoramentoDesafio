package r.m.k.desafio.remake.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @PostMapping
    @Transactional
    //cadastrar
    public ResponseEntity<Client> cadastrar(@RequestBody DadosCadastrosClient client ) {
        repository.save(new Client());
        System.out.println(client);
        return ResponseEntity.ok().build();

    }
    

}
