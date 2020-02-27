package br.com.delivery.deliveryoauthserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delivery.deliveryoauthserver.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
	
}