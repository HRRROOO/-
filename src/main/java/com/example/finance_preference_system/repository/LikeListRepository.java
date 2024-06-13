package com.example.financepreference.repository;

import com.example.financepreference.model.LikeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeListRepository extends JpaRepository<LikeList, Long> {
}
