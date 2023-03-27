package excavacion;

import java.util.ArrayList;

public class SitioArqueologico {
    ArrayList<Excavacion> listaExcavaciones;

    public SitioArqueologico() {
        this.listaExcavaciones = new ArrayList<>();
    }
    public void AgregarExcavacion(Excavacion excavacionAgregar){
        this.listaExcavaciones.add(excavacionAgregar);
    }

    @Override
    public String toString() {
        return "SitioArqueologico{" +
                "listaExcavaciones=" + listaExcavaciones +
                '}';
    }
}
