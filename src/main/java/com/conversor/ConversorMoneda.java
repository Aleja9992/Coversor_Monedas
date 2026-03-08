package com.conversor;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorMoneda {

    public double obtenerTasa(String json, String monedaDestino){

        JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        return rates.get(monedaDestino).getAsDouble();
    }
}
