package com.bn.crud.repositories;

import com.bn.crud.EstudanteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepostorie extends JpaRepository< EstudanteModel, Long> {
}