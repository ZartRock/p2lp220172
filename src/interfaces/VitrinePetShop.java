package interfaces;

import java.util.ArrayList;

import heranca.Animal;

public class VitrinePetShop {

	ArrayList<AnimalEstimacao> pets;
	
	public VitrinePetShop(){
		pets = new ArrayList<>();
	}
	
	public void adicionaPets(AnimalEstimacao p){
		pets.add(p);
	}
	
	public String serAmigavel(int index){
		return pets.get(index).serAmigavel();
	}
	
	public String brincar(int index){
		return pets.get(index).brincar();
	}

}


