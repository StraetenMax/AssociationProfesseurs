package ma.exelib.ecole;

public class Specialite {
	//propriétés
	private int id;
	private String code, libelle;
	private static int count;
	
	//constructeurs
	public Specialite(){
		code = "";
		libelle = "";
	}
	public Specialite(String cCode, String cLibelle){
		id = ++count;
		code = cCode;
		libelle = cLibelle;
		
	}
	
	// accesseurs mutateurs
	public int getId(){
		return id;
	}
	public void setId(int Id){
		id = ++count;
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
		return " Code : "+this.getCode()+" Libelle : "+this.getLibelle();
	}
	
	
}
