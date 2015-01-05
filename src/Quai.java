import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("24445645-8755-4642-a153-8715fd1f126f")
public class Quai implements GestionQuai {
    @mdl.prop
    @objid ("cb09b22c-23ec-427e-b9a2-1b3afcab7f44")
    private List<Avion> avion = new ArrayList<Avion> ();

    @mdl.propgetter
    public List<Avion> getAvion() {
        // Automatically generated method. Please do not modify this code.
        return this.avion;
    }

    @mdl.propsetter
    public void setAvion(final List<Avion> value) {
        // Automatically generated method. Please do not modify this code.
        this.avion = value;
    }

    @objid ("4b5c16e8-4888-45ea-a874-3980e496c41c")
    public void atterissage(final Avion avion) {
    }

    @objid ("7e6e842b-35e5-42dd-866d-8df54b5a7c25")
    public void decollage() {
    }

}
