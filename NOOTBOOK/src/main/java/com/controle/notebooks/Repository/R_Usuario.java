package com.controle.notebooks.Repository;

import com.controle.notebooks.Model.M_Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface R_Usuario extends JpaRepository<M_Usuario, Long> {


}
