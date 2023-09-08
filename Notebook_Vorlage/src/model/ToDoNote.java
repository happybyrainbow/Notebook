package model;

public class ToDoNote extends Note {
    private boolean completed;

    public ToDoNote(String title, String content) {
        //TODO: Implementiere den Konstruktor
        super(title, content);
        this.completed = false;
    }

    /**
     * Erzeugt aus allen Informationen einen Ausgabestring in der Form:
     * "[Titel]: [Inhalt]. Erstellt am: [Datum]. Fertiggestellt: [Ja/Nein]"
     * @return Ausgabestring für eine einzelne ToDoNotiz
     */
    @Override
    public String display() {
        //TODO: Implementiere die Methode display() entsprechend der Dokumentation / des Kommentars oben.
        String display = "Titel: " + title + " Inhalt: " + content + " Datum: " + getCreationDate() + " Fertiggestellt " + completed;
        return display;
    }

    /**
     * Ändert den Status der ToDoNotiz in das Gegenteil -> true zu false und umgekehrt.
     * Eine beendete ToDoNotiz kann auch wieder offen sein.
     */
    public void invertCompleted(){
        completed=!completed;
    }
}