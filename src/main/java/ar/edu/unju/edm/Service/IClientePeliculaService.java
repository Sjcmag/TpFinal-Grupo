package ar.edu.unju.edm.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.Model.ClientePelicula;
@Service
public interface IClientePeliculaService {

	public ClientePelicula nuevoClientePelicula();
	public void guardarClientePelicula(ClientePelicula clientMovie);
	public void eliminarClientePelicula(Integer id);
	public void modificarClientePelicula(ClientePelicula clientMovie);
	public List<ClientePelicula> listarClientePelicula();
	public ClientePelicula buscarClientePelicula(Integer id);
	
}
