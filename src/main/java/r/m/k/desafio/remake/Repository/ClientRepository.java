package r.m.k.desafio.remake.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import r.m.k.desafio.remake.Model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{}