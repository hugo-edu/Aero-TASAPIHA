import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c68bdba5-f877-495e-b2bc-50e3633f4c84")
public class Avion implements GestionAvion {
    @objid ("7bd50580-c8b7-4ac7-8a07-68a563d90c02")
    private String destination;

    @objid ("ef8adb24-cff2-4eac-ac1c-0491825e1214")
    private String marque;

    @objid ("7ca94b59-15a9-4536-9a35-16bde535ff1f")
    private String modele;

    @mdl.prop
    @objid ("5d669fd7-b446-4833-9469-1a3a586675dc")
    private List<Personne> passagers = new ArrayList<Personne> ();

    @mdl.propgetter
    public List<Personne> getPassagers() {
        // Automatically generated method. Please do not modify this code.
        return this.passagers;
    }

    @mdl.propsetter
    public void setPassagers(final List<Personne> value) {
        // Automatically generated method. Please do not modify this code.
        this.passagers = value;
    }

    @objid ("5f9443e7-9819-4948-a7cb-e31ad39fc61a")
    public String getDestination() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.destination;
    }

    @objid ("7ff3a860-4bb2-4114-912e-0da2fd167488")
    public void setDestination(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.destination = value;
    }

    @objid ("a2f9c3e7-4937-47e4-a448-9251f1f92553")
    public String getMarque() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.marque;
    }

    @objid ("64a30bf5-ab58-4d8c-bac8-38014c515398")
    public void setMarque(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.marque = value;
    }

    @objid ("23be9eb4-c94f-4f7f-9ae1-c91ab55d0686")
    public String getModele() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.modele;
    }

    @objid ("eb6a06e3-aeb1-44a7-9f0c-c9d977d6e790")
    public void setModele(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.modele = value;
    }

    @objid ("fbec41d9-ea96-442e-87f5-2d6fcc8bd391")
    public void atterissage(final String Parameter) {
    }

    @objid ("de910d7c-d012-4508-9cee-eb102ec99cd8")
    public void decollage() {
    }

    @objid ("aae61fa0-b6e2-4ea3-84b7-254c2861ad18")
    public void atterissage(final Avion avion) {
    }

    @objid ("c6b75c43-cf9a-4f06-add0-8638b4b64c83")
    public void embarquer(final Personne passager) {
    }

    @objid ("0e1482fb-94a1-4f5a-8271-e9eb96191faa")
    public void debarquer() {
    }

}
