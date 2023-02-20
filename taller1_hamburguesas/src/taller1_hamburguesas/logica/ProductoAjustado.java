package taller1_hamburguesas.logica;

import java.util.ArrayList;
import java.util.List;

public class ProductoAjustado implements Producto{
	
	private ProductoMenu base;
	
	private List<Ingrediente> agregados;
	
	private List<Ingrediente> eliminados;
	
	
	public ProductoAjustado (ProductoMenu base)
	{
		this.base = base;
		agregados = new ArrayList<Ingrediente>();
		eliminados = new ArrayList<Ingrediente>();
		
	}
	

	@Override
	public int getPrecio() {
		int precioBase = base.getPrecio();
		
		int size = agregados.size();
		if (size != 0) {
			for (Ingrediente elemento:agregados) {
			int precioElemento = elemento.getCostoAdicional();
			precioBase = precioBase + precioElemento;
			}
						}
		return precioBase;
	}

	@Override
	public String getNombre() {
		return base.getNombre();
		
	}

	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
