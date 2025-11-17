package controllers;
import models.Persona;

public class PersonaController {

    public Persona findByName(Persona[] personas, String name){
        int izquierda = 0;
        int derecha = personas.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (personas[medio].getName().equalsIgnoreCase(name)) {
                return personas[medio];
            }

            if (personas[medio].getName().compareToIgnoreCase(name) < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return null;
    }

    public void sortByName(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < personas.length - 1; j++) {
                if (personas[i].getName().compareToIgnoreCase(personas[j].getName()) < 0) {
                    Persona temp = personas[i];
                    personas[i] = personas[j];
                    personas[j] = temp;
                    swapped = true;
                }
            }
        }
    }
    
}
