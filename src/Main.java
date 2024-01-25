//Scrivere un programma che contenga una classe che definisce uno Studente
// che abbia come proprietà nome, cognome ed identificativo.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Studente.

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Giovanni", "Rossi", "A1");
        System.out.println("Studente: " +studente1);
        System.out.println("Studente: " +studente1.getNome());
        System.out.println("Studente: " +studente1.getCognome());
        System.out.println("Studente: " +studente1.getIdentificativo());
    }
}