package edu.utfpr.cp.dacom.sa.soilcorrection.control.conversores;

import edu.utfpr.cp.dacom.sa.soilcorrection.control.interfaces.Conversao;
import lombok.NonNull;

public class ConverteKgHaEmP2O5 implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException();
        }

        return valor * 2.29;
    }
}
