package fcu.iecs.oop.pokemon;

public abstract class Pokemon {
	
	private final String name;
	private final PokemonType type;
	private int cp;

	Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	
	public String getName(){
		return this.name;
	}
	public PokemonType getType(){
		return this.type;
	}
	
	public void setCP(int cp){
		this.cp=cp;
	}
	public int getCP(){
		return this.cp;
	}
	
	public abstract void attack();

}
