
public abstract class Item {

	private int posX;
	private int posY;
	
	public abstract void pegar() ;
		//Todo mundo que extende item tem que implementar o abstrato.

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
}
