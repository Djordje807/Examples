package Farm;

import java.util.Scanner;


public class Farma {
	
public String naziv;
public String lokacija;
private String tipFarme;
private String mlecniProizvodi;
private String zivina;
private String usevi;


public Farma(String naziv, String lokacija, String tipFarme, String mlecniProizvodi, String zivina, String usevi) {
	super();
	this.naziv = naziv;
	this.lokacija = lokacija;
	this.tipFarme = tipFarme;
	this.mlecniProizvodi = mlecniProizvodi;
	this.zivina = zivina;
	this.usevi = usevi;
}
public Farma() {
	// TODO Auto-generated constructor stub
}


public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	this.naziv = naziv;
}
public String getLokacija() {
	return lokacija;
}
public void setLokacija(String lokacija) {
	this.lokacija = lokacija;
}
public String getTipFarme() {
	return tipFarme;
}
public void setTipFarme(String tipFarme) {
	this.tipFarme = tipFarme;
}
public String getMlecniProizvodi() {
	return mlecniProizvodi;
}
public void setMlecniProizvodi(String mlecniProizvodi) {
	this.mlecniProizvodi = mlecniProizvodi;
}
public String getZivina() {
	return zivina;
}
public void setZivina(String zivina) {
	this.zivina = zivina;
}
public String getUsevi() {
	return usevi;
}
public void setUsevi(String usevi) {
	this.usevi = usevi;
}

public void UcitajFarmu() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Naziv farme:" + sc.next());
	System.out.println("Lokacija farme:" + sc.next());
	System.out.println("Tip farme:" + sc.next());
	System.out.println("Mlecni proizvodi:" + sc.next());
	System.out.println("Zivina:" + sc.next());
	System.out.println("Usevi:" + sc.next());
		
	}
public void PrikaziFarmu() {
	System.out.print("Naziv farme:" + this.naziv);
	System.out.print("Lokacija farme:" + this.lokacija);
	System.out.print("Tip farme :" + this.tipFarme);
	System.out.print("Mlecni proizvodi:" + this.mlecniProizvodi);
	System.out.print("Zivina:" + this.zivina);
	System.out.print("Usevi:" + this.usevi);

	
}



	



}
