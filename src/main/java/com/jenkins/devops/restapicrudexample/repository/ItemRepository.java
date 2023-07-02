package com.jenkins.devops.restapicrudexample.repository;

import com.jenkins.devops.restapicrudexample.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository  extends JpaRepository<Item, Long> {
}
