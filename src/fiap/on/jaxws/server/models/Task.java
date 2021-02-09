package fiap.on.jaxws.server.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Task {

	private Integer id;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", description=" + description + "]";
	}

}