package taller1_hamburguesas.logica;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int NumeroPedidos;
	private int idPedido;
	private String nombreCliente;
	private String direccionCliente;
	private List<Producto> itemsPedido;

	public Pedido(String nombreCliente, String direccionCliente) 
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		itemsPedido = new ArrayList<Producto>();
	}
	
	public int getIdPedido() 
	{
		return idPedido;
	}
	
	public void agregarProducto(Producto nuevoItem)
	{
		itemsPedido.add(nuevoItem);
	}
	
	private int getPrecioNetoPedido()
	{
		int precioNeto = 0;
		for (Producto productoPedido:itemsPedido) 
		{
			int precioProducto = productoPedido.getPrecio();
			precioNeto = precioNeto + precioProducto;
			
		}
		return precioNeto;
	}
	
	private int getPrecioIVAPedido()
	{
		int precioIva = 0;
		for (Producto productoPedido:itemsPedido)
		{
			int precioProducto = productoPedido.getPrecio();
			precioIva = (int) (precioIva + (precioProducto*1.19));
		}
		return precioIva;
	}
	
	private int getPrecioTotal()
	{
		int precioTotal = 0;
		for (Producto productoPedido: itemsPedido)
		{
			int precioProducto = productoPedido.getPrecio();
			int ivaProducto = (int) (precioProducto * 0.19);
			precioTotal = precioTotal + (precioProducto + ivaProducto);
			
		}
		
		return precioTotal;
	}

}
