package com.spotify.utils;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SelectionCanciones {
    public static WebElement selectorCanciones(List<WebElement> items, String cancionAbuscar){
        for(WebElement tituloCancionColeccion : items)
        {
            System.out.println(tituloCancionColeccion.getText().toLowerCase());
            if(tituloCancionColeccion.getText().toLowerCase().contains(cancionAbuscar.toLowerCase())){
                return tituloCancionColeccion;
            }
        }
        return null;
    }
}
