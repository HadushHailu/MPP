package ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.business;

import java.util.List;

import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.business.Book;
import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.dataaccess.DataAccess;
import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.dataaccess.DataAccessFacade;

public interface ControllerInterface {
	public void login(String id, String password) throws LoginException;
	public List<String> allMemberIds();
	public List<String> allBookIds();
	
}
