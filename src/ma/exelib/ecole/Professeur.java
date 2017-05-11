package ma.exelib.ecole;

public class Professeur {
    //propriétés
	private int id;
	private String nom; 
	private String prenom;
	private String telephone;
	private String email;
	private Specialite specialite;
	
	//constructeurs
	public Professeur(){
		id = 0;
		nom = "";
		prenom = "";
		telephone = "";
		email = "";
		specialite = null;
	}
	public Professeur(int cId, String cNom, String cPrenom, String cTelephone, String cEmail, Specialite cSpecialite){
		id = cId;
		nom = cNom;	
		prenom = cPrenom;
		telephone = cTelephone;
		email = cEmail;
		specialite = cSpecialite;
	}
	
	//accesseurs mutateurs
		public int getId(){
			return id;
		}		
		public String getNom(){
			return nom;
		}
		public String getPrenom(){
			return prenom;
		}
		public String getTelephone(){
			return telephone;
		}
		public String getEmail(){
			return email;
		}
		
		public void setId(int xId){
			id = xId;
		}
		public void setNom(String xNom){
			nom = xNom;
		}
		public void setPrenom(String xPrenom){
			prenom = xPrenom;
		}
		public void setTelephone(String xTelephone){
			telephone = xTelephone;
		}
		public void setEmail(String xEmail){
			email = xEmail;
		}
		
		//méthodes
		public String toString(){
			return "Id : "+this.getId()+" Nom : "+this.getNom()+" Prénom : "+this.getPrenom()+" Téléphone : "+this.getTelephone()+" Email : "+this.getEmail();
		}
		
		
	
}
