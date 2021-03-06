package calculadora;

import java.util.Random;
import java.util.*;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;


@ManagedBean (name = "guessBean")
@SessionScoped
//@ApplicationScoped
public class Adivinar {

	private Random r = new Random();
	private int trys = 0;
	private int number = r.nextInt(10)+1;
	private int score = 100000; 
	private int intento = 0;

	private ArrayList<Integer> listado = new ArrayList<Integer>(); 
	boolean win = false; 
	

	public Adivinar(){
	}

	public void setIntento(int intento){
		this.intento = intento; 
	}

	public int getIntento(){
		return intento;
	}

	public void setNumber(int number){
		this.number= number; 
	}

	public int getScore(){
		return score; 
	}
	public int getTrys(){
		return trys;
	}
	public int getNumber(){
		return number; 
	}
	public void guess(){
		win =  (intento == number) ;
		addTry();
		if(! win){
			listado.add(intento);
			fail();
		}
	}
	public void restart(){
		trys = 0; 
		r = new Random(); 
		number = r.nextInt(10);
		score = 100000;
		win = false; 
		listado = new ArrayList<Integer>(); 

	}
	public String getWin(){
		String c = "Ganó";
		if(! win) c = "No ha ganado";
		return c;
	}
	public void addTry(){
		trys ++;
	}
	public void fail(){
		if (score - 10000 >= 0) score -= 10000;
	}
	public void setListado(ArrayList<Integer> listado){
		this.listado = listado;  
	}

	public String getListado (){
		String toReturn = "";
		for(int i = 0 ; i< listado.size() ; i++ ){
			if (i != listado.size()-1){
				toReturn += (String.valueOf(listado.get(i)) + " , ");
			}
			else{
				toReturn += String.valueOf(listado.get(i)); 
			}
			
		} 
		return toReturn; 
	}

	
}