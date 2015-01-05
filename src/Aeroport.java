import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7d3a13b6-d0cb-4121-a7c2-a5392fdf2753")
public class Aeroport {
    @objid ("b5604c95-de17-4a28-825f-5a7e25ea51c2")
    private String nom;

    @objid ("261db0ea-5e7b-47f1-9c87-fe3ba8d0ff25")
    private String ville;

    @objid ("0fffa4d4-03bf-419d-b3d9-09b1b6a146f8")
    private String pays;

    @objid ("0095c088-f8be-421d-9f29-75838b1ee349")
    private int nombreQuai;

    @mdl.prop
    @objid ("315742fc-1a59-493e-9533-a604a93168f5")
    private List<Quai> quais = new ArrayList<Quai> ();

    @mdl.propgetter
    public List<Quai> getQuais() {
        // Automatically generated method. Please do not modify this code.
        return this.quais;
    }

    @mdl.propsetter
    public void setQuais(final List<Quai> value) {
        // Automatically generated method. Please do not modify this code.
        this.quais = value;
    }

    @objid ("cf42bef4-b22c-4769-b200-b94964fc627c")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("7dbcf5d8-8001-4086-b50b-bc59a625aa20")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("7b66fb79-523d-4f58-a7f0-9ca9b79d6e2c")
    public String getVille() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.ville;
    }

    @objid ("95b8292a-55f5-4d1a-b590-3274bee3b684")
    public void setVille(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.ville = value;
    }

    @objid ("b7e269c9-9bdf-41df-8142-89df627e6f6c")
    public String getPays() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.pays;
    }

    @objid ("69e49116-cee2-433f-a4e4-6376434c15e7")
    public void setPays(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.pays = value;
    }

    @objid ("efc2e2a4-95bb-49fd-ae5e-bde616c27c0d")
    public int getNombreQuai() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nombreQuai;
    }

    @objid ("504cec3d-8284-460a-a937-06b387e9a2fb")
    public void setNombreQuai(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nombreQuai = value;
    }

}
