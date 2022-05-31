package models;

import repositories.IConverter;

public class USDToMXNConverter implements IConverter {

    private final Double RATE = 18.90;
    @Override
    public Double convert(Double qty) {
        return qty * RATE;
    }
}
