package br.com.taac.leilao.repositories;

import br.com.taac.leilao.model.Lance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanceRepository extends JpaRepository<Lance, Long> {

}
