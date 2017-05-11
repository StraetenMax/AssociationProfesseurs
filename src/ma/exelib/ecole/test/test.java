package ma.exelib.ecole.test;

import ma.exelib.ecole.Professeur;
import ma.exelib.ecole.Specialite;

public class test {

	public static void main(String[] args) {
	
		Specialite[] specialites = new Specialite[5];
		//création des spécialités
		specialites[0] = new Specialite("S1","JAVA/JEE");
		specialites[1] = new Specialite("S2",".net");
		specialites[2] = new Specialite("S3","Gestion de projet");
		specialites[3] = new Specialite("S4","CISCO");
		specialites[4] = new Specialite("S5", "PHP");
	
		//création des Professeurs
		Professeur professeur[] = new Professeur[4];
	
		professeur[0] = new Professeur("Safi","salim","0656787567","safi [AT] gmail [DOT] com",specialites[0]);
		professeur[1] = new Professeur("Rami","amal","0604887567","rami [AT] gmail [DOT] com",specialites[3]);
		professeur[2] = new Professeur("Rashidi","mohamed","0676787567","rashidi [AT] gmail [DOT] com",specialites[0]);
		professeur[3] = new Professeur("Simon","thomas","0624912559","simon [AT] gmail [DOT] com",specialites[3]);
	
	}

}
