package net.roseindia.model;

// Generated 26-jun-2012 23:13:31 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Rafael de los Santos Guirado
 *
 */
@Entity
@Table(name = "libroUsuario", catalog = "gestionlibreria")
public class LibroUsuario implements java.io.Serializable {

	private static final long serialVersionUID = 7432344000632778194L;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LibroUsuario other = (LibroUsuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibroUsuario [id=" + id + ", usuario=" + usuario + ", libro="
				+ libro + "]";
	}

	private Long id;
	private Usuario usuario;
	private Libro libro;

	public LibroUsuario() {
	}

	public LibroUsuario(Usuario usuario, Libro libro) {
		this.usuario = usuario;
		this.libro = libro;
	}

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro")
	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

}
