package br.com.delivery.deliveryorderservice.repository;


import org.springframework.data.repository.CrudRepository;

import br.com.delivery.deliveryorderservice.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {
	
}