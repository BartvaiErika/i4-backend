package com.example.lechef.repository;

import com.example.lechef.persistence.Shoppinglist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<Shoppinglist, Long> {

}
