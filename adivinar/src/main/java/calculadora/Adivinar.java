package calculadora;

import java.util.Random;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean (name = "guessBean")
@ApplicationScoped
public class Adivinar {

	private Random r = new Random();
	private int trys = 0;
	private int number = r.nextInt(10);
	private int score = 100000; 
	private int intento = 0;
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
			fail();
		}
	}
	public void restart(){
		trys = 0; 
		r = new Random(); 
		number = r.nextInt(10);
		score = 100000;
		win = false; 
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

	
}