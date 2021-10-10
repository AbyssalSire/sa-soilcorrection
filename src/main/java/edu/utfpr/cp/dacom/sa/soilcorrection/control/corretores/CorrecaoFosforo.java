package edu.utfpr.cp.dacom.sa.soilcorrection.control.corretores;

import edu.utfpr.cp.dacom.sa.soilcorrection.control.interfaces.ICorrecaoNutriente;
import edu.utfpr.cp.dacom.sa.soilcorrection.control.interfaces.ICorrecaoNutrienteQuantidadeAplicar;
import edu.utfpr.cp.dacom.sa.soilcorrection.model.fonte.FonteFosforo;

public class CorrecaoFosforo 
    implements 
        ICorrecaoNutriente<FonteFosforo>,
        ICorrecaoNutrienteQuantidadeAplicar<FonteFosforo> {
    
}
