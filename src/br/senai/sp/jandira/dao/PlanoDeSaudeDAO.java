package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class PlanoDeSaudeDAO {
    
    private ArrayList<PlanoDeSaude> planos = new ArrayList<>();

    public ArrayList<PlanoDeSaude> getPlanos() {
        return planos;
    }

    public void salvar(PlanoDeSaude plano) {
        planos.add(plano);
    }
    
}
