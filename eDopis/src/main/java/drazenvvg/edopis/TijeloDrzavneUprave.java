package drazenvvg.edopis;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("TDU")
public class TijeloDrzavneUprave implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "TDU ID")
   private java.lang.Integer tduID;
   @org.kie.api.definition.type.Label(value = "Naziv")
   private java.lang.String naziv;
   @org.kie.api.definition.type.Label(value = "Mjesto sjedi\u0161ta")
   private java.lang.String mjestoSjedista;

   public TijeloDrzavneUprave()
   {
   }

   public java.lang.Integer getTduID()
   {
      return this.tduID;
   }

   public void setTduID(java.lang.Integer tduID)
   {
      this.tduID = tduID;
   }

   public java.lang.String getNaziv()
   {
      return this.naziv;
   }

   public void setNaziv(java.lang.String naziv)
   {
      this.naziv = naziv;
   }

   public java.lang.String getMjestoSjedista()
   {
      return this.mjestoSjedista;
   }

   public void setMjestoSjedista(java.lang.String mjestoSjedista)
   {
      this.mjestoSjedista = mjestoSjedista;
   }

   public TijeloDrzavneUprave(java.lang.Integer tduID, java.lang.String naziv,
         java.lang.String mjestoSjedista)
   {
      this.tduID = tduID;
      this.naziv = naziv;
      this.mjestoSjedista = mjestoSjedista;
   }

}