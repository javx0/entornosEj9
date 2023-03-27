import excavacion.Excavacion;
import excavacion.Objeto;
import excavacion.SitioArqueologico;

public class Main {
    public static void main(String[] args) {
        Objeto objeto1 = new Objeto(1,"1910","20cm x 10cm x 5cm","primer objeto","madera",Objeto.GetEstado("completo"),"trabajo");
        Excavacion excavacion1 = new Excavacion("01-01-2016","01-01-2017");
        SitioArqueologico sitioArqueologico1 = new SitioArqueologico();

        excavacion1.AgregarObjeto(objeto1);
        sitioArqueologico1.AgregarExcavacion(excavacion1);

        System.out.println(sitioArqueologico1);
    }
}
