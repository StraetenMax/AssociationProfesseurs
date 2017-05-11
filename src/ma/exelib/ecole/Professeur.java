package ma.exelib.ecole;

public class Professeur {
    //propriétés
	private int id;
	private String nom, prenom, telephone, email;
	
	//constructeurs
	public Professeur(){
		id = 0;
		nom = "";
		prenom = "";
		telephone = "";
		email = "";
	}
	public Professeur(int cId, String cNom, String cPrenom, String cTelephone, String cEmail){
		id = cId;
		nom = cNom;	
		prenom = cPrenom;
		telephone = cTelephone;
		email = cEmail;
	}
	
	//accesseurs mutateurs
	
	
}
