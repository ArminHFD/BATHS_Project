package wars; 


/**
 * Details of your team
 * 
 */
public class Teamwork
{
    private String[] details = new String[12];
    
    public Teamwork()
    {   // in each line replace the contents of the String 
        // with the details of your team member
        // Please list the member details alphabetically by surname 
        // i.e. the surname of member1 should come alphabetically 
        // before the surname of member 2...etc
        details[0] = "CS35";
        
        details[1] = "Bajahaw";
        details[2] = "Heytham";
        details[3] = "22104295";

        details[4] = "Bontinis";
        details[5] = "Alexandros";
        details[6] = "22054966";

        details[7] = "Cinato";
        details[8] = "Ryan";
        details[9] = "22053327";


        details[10] = "Hatamifard";
        details[11] = "Armin";
        details[12] = "19045451";

	


    }
    
    public String[] getTeamDetails()
    {
        return details;
    }
    
    public void displayDetails()
    {
        for(String temp:details)
        {
            System.out.println(temp.toString());
        }
    }
}
        
