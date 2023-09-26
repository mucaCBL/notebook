package com.controle.notebooks.Service;

import com.controle.notebooks.Model.M_Software;
import com.controle.notebooks.Repository.R_Softwear;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class S_Software {
    private static R_Softwear r_softwear;

    public static void setR_softwear(R_Softwear r_softwear) {
        S_Software.r_softwear = r_softwear;
    }

    public static String cadastrarSoftware(String nome, boolean licenca){
        boolean podeSalvar = true;
        String mensagem = "";

        if(S_Generico.textoEstaVazio(nome)){
            mensagem += "O nome precisa ser informado";
        } else{
            M_Software m_software = new M_Software();
            m_software.setNome(nome);
            m_software.setExigeLicensa(licenca);
            try {
                r_softwear.save(m_software);
                mensagem += "Softwear cadastrado com sucesso!";
            }catch (DataIntegrityViolationException e){
                mensagem += "Falha ao incluir o registro no banco de dados!";
            }
        }
        return mensagem;
    }
}
