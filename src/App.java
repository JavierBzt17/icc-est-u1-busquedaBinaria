import views.BubbleSort;
import views.ShowConsole;
import controllers.BusquedaBinaria;
import controllers.PersonaController;
import models.Persona;


public class App {
    public static void main(String[] args) throws Exception {
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria();
        ShowConsole showConsole = new ShowConsole();   
        BubbleSort bubbleSort = new BubbleSort();   



        int[] arr = {10, 2, 4, 6, 8, 13, 20};
        bubbleSort.bubbleSort(arr);
        Integer result = busquedaBinaria.buscadaNumero(arr, 10);

        showConsole.showResult(result, 10);

        Persona[] personas = {
            new Persona("Juan", 25),
            new Persona("Ana", 30),
            new Persona("Pedro", 20),
            new Persona("Maria", 28),
            new Persona("Luis", 22),
            new Persona("Carmen", 27),
            new Persona("Sofia", 24),

        };

        PersonaController personaController = new PersonaController();
        Persona personaResult = personaController.findByName(personas, "Pedro");
        showConsole.showPersonResult(personaResult, "Pedro");
    }
}
