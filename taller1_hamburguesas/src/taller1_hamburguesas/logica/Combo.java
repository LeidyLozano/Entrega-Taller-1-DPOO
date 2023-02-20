package taller1_hamburguesas.logica;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto {
	
	private double descuento;
	
	private String nombreCombo;
	
	private List<ProductoMenu> itemsCombo;
	
	public Combo(String nombre, double descuento)
		{this.nombreCombo = nombre;
		this.descuento = descuento;
		itemsCombo = new ArrayList<ProductoMenu>(); }
	
	
	public void agregarItemACombo(Producto ItemCombo) 
	{
		itemsCombo.add((ProductoMenu) ItemCombo);
	}
	@Override
	public int getPrecio() {
		
		int precioFinal = 0;
		for (ProductoMenu productoCombo:itemsCombo)
			{
				int precioProducto = productoCombo.getPrecio();
				precioFinal = precioFinal + precioProducto;
			}
		int descuentoCombo = (int) (precioFinal * (descuento/100));
		precioFinal = precioFinal - descuentoCombo;
		
		return precioFinal;
		
		
		
	}

	@Override
	public String getNombre() {
		
		return nombreCombo;
	}

	@Override
	public String generarTextoFactura() {
		String res = "-Combo " + nombreCombo;
		return res;
	}

}
