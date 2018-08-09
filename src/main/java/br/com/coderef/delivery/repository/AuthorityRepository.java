package br.com.coderef.delivery.repository;

import br.com.coderef.delivery.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String>{

    Authority findByName(String name);

}