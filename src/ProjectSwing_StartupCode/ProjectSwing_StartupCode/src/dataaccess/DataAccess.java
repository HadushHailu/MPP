package ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.dataaccess;

import java.util.HashMap;

import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.business.Book;
import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.business.LibraryMember;
import ProjectSwing_StartupCode.ProjectSwing_StartupCode.src.dataaccess.*;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
	public void saveNewMember(LibraryMember member); 
}
