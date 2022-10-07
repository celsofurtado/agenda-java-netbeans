package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;

public class Banco {
    
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    
    static {
        PlanoDeSaude p1 = new PlanoDeSaude();
        p1.setOperadora("Unimed");
        p1.setCategoria("Bronze");
        p1.setNumero("98745-9657");
        p1.setValidade(LocalDate.of(2023, 6, 30));
        planos.add(p1);
        
        PlanoDeSaude p2 = new PlanoDeSaude();
        p2.setOperadora("Bradesco");
        p2.setCategoria("Ouro");
        p2.setNumero("6325-9854-8855");
        p2.setValidade(LocalDate.of(2023, 2, 15));
        planos.add(p2);
        
        PlanoDeSaude p3 = new PlanoDeSaude();
        p3.setOperadora("Bradesco");
        p3.setCategoria("Ouro");
        p3.setNumero("6325-9854-8855");
        p3.setValidade(LocalDate.of(2023, 2, 15));
        planos.add(p3);
    }
    
    public void adicionaPlano(PlanoDeSaude plano) {
        planos.add(plano);
    }
    
    public ArrayList<PlanoDeSaude> getPlanos() {
        return this.planos;
    }
    
}
