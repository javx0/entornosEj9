package excavacion;

public class Objeto {
    private enum Estado{COMPLETO, FRAGMENTADO}

    int codigo;
    String datacion;
    String dimensiones;
    String descripcion;
    String material;
    Estado estado;
    String uso;

    public Objeto(int codigo, String datacion, String dimensiones, String descripcion, String material, Estado estado, String uso) {
        this.codigo = codigo;
        this.datacion = datacion;
        this.dimensiones = dimensiones;
        this.descripcion = descripcion;
        this.material = material;
        this.estado = estado;
        this.uso = uso;
    }

    public static Estado GetEstado(String estado){
        return switch (estado){
            case "completo" -> Estado.COMPLETO;
            case "fragmentado" -> Estado.FRAGMENTADO;
            default -> null;
        };
    }

    @Override
    public String toString() {
        return "\nObjeto{" +
                "codigo=" + codigo +
                ", datacion='" + datacion + '\'' +
                ", dimensiones='" + dimensiones + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", material='" + material + '\'' +
                ", estado=" + estado +
                ", uso='" + uso + '\'' +
                "}\n";
    }
}
