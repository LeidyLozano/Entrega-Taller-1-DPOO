package taller1_hamburguesas.logica;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	
	private ArrayList<Combo> Combos;
	private ArrayList<Pedido> Pedidos;
	private ArrayList<ProductoMenu> menuBase;
	private ArrayList <Ingrediente> Ingredientes;
	private Pedido pedidoEnCurso;

	public Restaurante(Pedido pedido) 
	{
		Combos = new ArrayList<Combo>();
		Pedidos = new ArrayList<Pedido>();
		menuBase = new ArrayList<ProductoMenu>();
		Ingredientes = new ArrayList<Ingrediente>();
		this.pedidoEnCurso = pedido;
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) 
	{
		Pedido nuevoPedido = new Pedido(nombreCliente, direccionCliente); 
	}
	
	
	public Pedido getPedidoEnCurso()
	{
		return pedidoEnCurso;
	}
	
	public ArrayList<Ingrediente> getIngredientes()
	{
		return Ingredientes;
	}
	
	public ArrayList<ProductoMenu> getMenuBase()
	{
		return menuBase;
	}
	public void cargarInformacionRestaurantes(File archivoIngredientes, File archivoMenu, File archivoCombos)
	{
		
	}
}
