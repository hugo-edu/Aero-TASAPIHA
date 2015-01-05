import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1c3b41b5-a1df-459f-ad3c-a67aa5b0ad8e")
public interface GestionAvion {
    @objid ("93778d12-9b17-440e-9055-e4ac3bcb6c03")
    void embarquer(final Personne passager);

    @objid ("9d3ff035-e224-4460-96a1-73116fa9e37c")
    void debarquer();

}
