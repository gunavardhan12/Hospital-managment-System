package hms;
public class Patient {
    private String patientId;
    private String Name;
    private String contact;
    public Patient(){
        patientId = "";
        Name = "";
        contact ="";
    }
    public Patient(String patientId,String Name,String contact) {
        this.patientId = patientId;
        this.Name = Name;
        this.contact = contact;
    }
    public void setpatientId(String patientId){
        this.patientId = patientId;
    }
    public String getpatientId(){
        return patientId;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return Name;
    }
    public void setcontact(String contact){
        this.contact=contact;
    }
    public String getcontact(){
        return contact;
    }
    @Override
    public String toString(){
        return "Patient [ " + "PatientID = " + patientId + ", Name = " + Name + ", contact = " + contact + " ]";
    }
}