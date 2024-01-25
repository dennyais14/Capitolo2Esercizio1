public class Studente {
   public String nome;
    public String cognome;
   public String identificativo;

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo='" + identificativo + '\'' +
                '}';
    }

    public Studente(String nome, String cognome, String identificativo){
       this.nome = nome;
       this.cognome = cognome;
       this.identificativo = identificativo;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }
}
