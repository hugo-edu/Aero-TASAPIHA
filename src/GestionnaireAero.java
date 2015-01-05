import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8f4c99c2-027d-4da5-b1ed-e7e5b9a6b442")
public class GestionnaireAero {
    @mdl.prop
    @objid ("e86a9731-8534-4cf7-9cd0-770e407350d6")
    private Aeroport aeroport;

    @mdl.propgetter
    public Aeroport getAeroport() {
        // Automatically generated method. Please do not modify this code.
        return this.aeroport;
    }

    @mdl.propsetter
    public void setAeroport(final Aeroport value) {
        // Automatically generated method. Please do not modify this code.
        this.aeroport = value;
    }

}
