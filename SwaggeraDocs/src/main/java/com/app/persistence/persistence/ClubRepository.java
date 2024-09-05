package com.app.persistence.persistence;

import com.app.persistence.entity.ClubEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends ListCrudRepository<ClubEntity, Long> {}