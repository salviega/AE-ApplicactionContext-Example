package models;

import repositories.IConverter;

public class USDToCOPConverter implements IConverter {

    private final Double RATE = 3478.15;

    @Override
    public Double convert(Double qty) {
        return qty * RATE;
    }
}
