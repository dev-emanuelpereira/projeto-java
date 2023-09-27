package org.example.utils;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    static NumberFormat real = new DecimalFormat("R$ #,##0.00");
    static NumberFormat cpf = new DecimalFormat("###.###.###-##000.000.000-00");

    public static String numeroParaReal (Double valor) {
        return real.format(valor);
    }

    public static String numeroParaCPF (Double valor) {
        return cpf.format(valor);
    }
}
