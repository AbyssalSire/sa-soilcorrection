package edu.utfpr.cp.dacom.sa.soilcorrection.control.interfaces;

import java.util.Set;

import edu.utfpr.cp.dacom.sa.soilcorrection.model.nutrientes.NutrienteAdicional;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
