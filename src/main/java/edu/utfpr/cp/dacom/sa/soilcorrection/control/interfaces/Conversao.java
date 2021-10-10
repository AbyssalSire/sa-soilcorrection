package edu.utfpr.cp.dacom.sa.soilcorrection.control.interfaces;

public interface Conversao<T, R> {

    public R converte(T valor);
}
