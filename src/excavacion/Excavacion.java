package excavacion;

import java.util.ArrayList;

public class Excavacion {
    String fechaInicio;
    String fechaFin;
    ArrayList<Objeto> listaObjetos;

    public Excavacion(String fechaInicio, String fechaFin) {
        this.listaObjetos = new ArrayList<>();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public void AgregarObjeto(Objeto objetoAgregar){
        this.listaObjetos.add(objetoAgregar);
    }

    @Override
    public String toString() {
        return "\nExcavacion{" +
                "fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", listaObjetos=" + listaObjetos +
                "}\n";
    }
}
