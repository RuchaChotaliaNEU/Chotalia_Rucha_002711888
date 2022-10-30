
package model;

import java.util.ArrayList;

/**
 *
 * @author ruchachotalia
 */
public class personDirectory {
    private ArrayList<person> PersonDirectory;
    
    public personDirectory() {
        PersonDirectory = new ArrayList<>();
    }
    
    public ArrayList<person> getPersonHistory() {
        return PersonDirectory;
    }
    
    public void setPersonHistory(ArrayList<person> personHistory) {
        this.PersonDirectory = personHistory;
    }
    
    public person createAndAddPerson() {
        person person = new person();
        PersonDirectory.add(person);
        return person;
    }
    
    public void deletePerson(person person) {
        PersonDirectory.remove(person);
    }
    
    public ArrayList<person> searchPatient(String key)
    {
        ArrayList<person> searchPatientDirectory = new ArrayList();
        for(person person: PersonDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<person> searchPerson(String key)
    {
        ArrayList<person> searchPersonDirectory = new ArrayList();
        for(person person: PersonDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}
