package org.example.Herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int idactividadesExra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista(String nombre, int edad, int numcuenta, String carrera, double promedio, int idactividadesExra, String deporte, String arte) {
        super(nombre, edad, numcuenta, carrera, promedio);
        this.idactividadesExra = idactividadesExra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getIdactividadesExra() {
        return idactividadesExra;
    }

    public void setIdactividadesExra(int idactividadesExra) {
        this.idactividadesExra = idactividadesExra;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super .toString() +
                "AlumnoDeportistaArtista{" +
                "idactividadesExra=" + idactividadesExra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }


    @Override
    public int ensayar(String disciplina) {
        System.out.println(;"El alumno esta ensayando" + this.arte);
        return 2;
    }

    @Override
    public boolean prensentarObra() {
        System.out.println(getNombre() + "Esta presentando su obra");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + "esta entrenando el deporte" + deporte)
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre() + "esta en competencia del deporte" + deporte)
        return false;
    }


}
