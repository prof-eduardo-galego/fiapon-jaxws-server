package fiap.on.jaxws.server.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fiap.on.jaxws.server.models.Task;

@WebService
public interface TasksService {

	@WebMethod
	void createTask(Task task);
	
	@WebMethod
	List<Task> listAll();

}
