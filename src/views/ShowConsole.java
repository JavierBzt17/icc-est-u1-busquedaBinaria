package views;

import models.Persona;

public class ShowConsole {
    public void showResult(int resultado, int valorbuscado){
        if (resultado != -1){
            System.out.println("El numero " + valorbuscado + " fue encontrado.");
        } else {
            System.out.println("El numero " + valorbuscado + " no fue encontrado.");
        }

    }

    public void showPersonResult(Persona persona, String nombreBuscado){
        if (persona != null){
            System.out.println("La persona " + nombreBuscado + " fue encontrada.");
        } else {
            System.out.println("La persona " + nombreBuscado + " no fue encontrada.");
        }
        
    }


}
