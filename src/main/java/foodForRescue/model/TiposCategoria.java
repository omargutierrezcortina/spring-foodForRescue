package foodForRescue.model;

/**
 * Entity implementation class for Entity: Categorias
 *
 */
public enum TiposCategoria {
	LEGUMBRES(1, "Legumbres", "img/Legumbres/prin-legumbres.jpg"), BEBIDAS(2,"Bebidas","img/Bebidas/cubitera.jpg"), 
	PANADERIA(3,"Panaderia", "img/foto_panaderia/pana_2.jpg"), CONSERVAS (4, "Conservas", "img/conservas/conservas.jpg"),
	EMBUTIDOS(5, "Embutidos", "img/Embutidos/embutidos-asturianos.jpg"), POSTRES(6, "Postres", "img/Postres/canutillos.jpg"),
	FRUTOSSECOS(7, "FrutosSecos", "img/fotos_frutosSecos/frutossecos.jpg"), QUESOS(8, "Quesos", "images/Quesos/quesos-asturianos.jpg");

	private final int id;
	private final String value;
	private final String imagen;

	TiposCategoria(int id, String value, String imagen) {
		this.id=id;
		this.value = value;
        this.imagen = imagen;
	} 
 
	public String getValue() {
		return value;
	}

	public int getId() {
		return id;
	}

	public String getImagen() {
		return imagen;
	}
	
	
	
	

}
