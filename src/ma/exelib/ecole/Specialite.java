package ma.exelib.ecole;

public class Specialite {
	//propriétés
	private int id;
	private String code, libelle;
	
	//constructeurs
	public Specialite(){
		id = 0;
		code = "";
		libelle = "";
	}
	public Specialite(int cId, String cCode, String cLibelle){
		id = cId;
		code = cCode;
		libelle = cLibelle;
	}
	
	// accesseurs mutateurs
	public int getId(){
		return id;
	}
	public void setId(int xId){
		id = xId;
	}
	public String getCode(){
		return code;
	}
	public void setCode(String xCode){
		code = xCode;
	}
	public String getLibelle(){
		return libelle;
	}
	public void setLibelle(String xLibelle){
		libelle = xLibelle;
	}
	
	//méthodes
	public String toString(){
		return "Id : "+this.getId()+" Code : "+this.getCode()+" Libelle : "+this.getLibelle();
	}
	
	
}
