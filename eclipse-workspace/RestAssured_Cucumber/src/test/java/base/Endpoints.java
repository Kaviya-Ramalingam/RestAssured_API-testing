package base;

public class Endpoints {
	
	public static String base_URL = "https://lms-api-hackathon-june2023-930a8b0f895d.herokuapp.com/lms";
	
	//program module
    public static String postProgram_URL = base_URL +"/saveprogram";
    public static String getAllProgram_URL = base_URL +"/allPrograms";
    public static String getOneProgramId = base_URL+"/programs/{programId}";
    public static String putprogramByName_URL = base_URL +"/program/{programName}";
    public static String putProgramById_URL = base_URL +"/putprogram/{programId}";		
    public static String deleteProgramByName_URL = base_URL +"/deletebyprogname/{programName}";
    public static String deleteProgramById_URL = base_URL +"/deletebyprogid/{programId}";
    
    //BatchModule
    
    
    //userModule
    
    //AssignmentModule
    
    //AssignmentSubmissionModule
   }


