package televisores;

import televisores.TV;

public class Control {
	private TV tv;
	
	public void turnOn( ) {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
	
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumenDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		if (this.tv.estado) {
			this.tv.setCanal(canal);
		}
	}
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	public TV getTv() {
		return this.tv;
	}
}
