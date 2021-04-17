package com.example.template.Template.app.repository;

import com.example.template.Template.app.data.RolesDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<RolesDTO, Integer> {
}
