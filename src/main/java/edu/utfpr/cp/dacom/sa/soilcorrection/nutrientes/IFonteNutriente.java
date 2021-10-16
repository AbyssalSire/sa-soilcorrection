package edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
