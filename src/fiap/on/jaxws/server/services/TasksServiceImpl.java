package fiap.on.jaxws.server.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import fiap.on.jaxws.server.models.Task;

@WebService(endpointInterface = "fiap.on.jaxws.server.services.TasksService")
public class TasksServiceImpl implements TasksService {

	private static final List<Task> REPO = new ArrayList<Task>();

	@WebMethod
	@Override
	public void createTask(Task task) {
		REPO.add(task);
	}

	@WebMethod
	@Override
	public List<Task> listAll() {
		return REPO;
	}

}
