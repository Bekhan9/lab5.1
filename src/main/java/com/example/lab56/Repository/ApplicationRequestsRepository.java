package com.example.lab56.Repository;

import com.example.lab56.model.ApplicationRequests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRequestsRepository extends JpaRepository<ApplicationRequests, Long> {
}
