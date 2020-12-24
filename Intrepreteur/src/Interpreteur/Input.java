package Interpreteur;

public class Input {
    String type;
    String valeur;

    public Input() {
        this.type="";
        this.valeur=null;
    }

    public Input(String type,String valeur) {
        this.type=type;
        this.valeur=valeur;
    }

    @Override
    public String toString() {
        return "Donnee{" +
                "type='" + type + '\'' +
                ", valeur=" + valeur +
                '}';
    }
}
