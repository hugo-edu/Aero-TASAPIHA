import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("ff06fc23-2248-4447-a736-885e35856615")
public class Personne {
    @objid ("4539d8fd-53d1-4a08-bcd2-018b455cf704")
    private String nom;

    @objid ("9a850ef9-a8b5-4118-b732-353f78a3b9e4")
    private String prenom;

    @objid ("fb58e476-34c9-4ebe-92ff-0bbd8ea46641")
    private int poids;

    @objid ("98dcfa64-f6c9-4d05-8602-bdd152a3aaae")
    public String getNom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.nom;
    }

    @objid ("231cfacb-69c2-40be-bf5c-d94131edba36")
    public void setNom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.nom = value;
    }

    @objid ("557dee1f-87ce-4236-b30a-3d0126183d92")
    public String getPrenom() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.prenom;
    }

    @objid ("a0f171aa-8356-4f11-8cb0-f0083fddc081")
    public void setPrenom(final String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.prenom = value;
    }

    @objid ("a230a925-ad40-4143-a84c-f516b136145d")
    public int getPoids() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.poids;
    }

    @objid ("8635f33c-9988-4d35-8d59-291ef70d9a8c")
    public void setPoids(final int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.poids = value;
    }

}
