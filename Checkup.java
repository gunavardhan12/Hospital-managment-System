package hms;

public class Checkup {
    Doctor Doctor;
    Patient Patient;
    String Recomendation,Date;
    int Priority;
    public Checkup(){
        
    }
    public Checkup(Doctor Doctor,Patient Patient,int Priority,String Recomendation,String Date){
        this.Doctor =Doctor;
        this.Patient =Patient;
        this.Recomendation =Recomendation;
        this.Date =Date;
        this.Priority =Priority;
    }
    public void setDoctor(Doctor Doctor){
        this.Doctor = Doctor;
    }
    public void setPatient(Patient Patient){
        this.Patient = Patient;
    }
    public  void setRecomandation (String Recomendation){
        this.Recomendation =Recomendation;
    }
    public void setDate(String Date){
        this.Date=Date;
    }
    public void setPriority(int Priority){
        this.Priority =Priority;
    }
    public Doctor getDoctor(){
        return Doctor;
    }
    public Patient getPatient(){
        return Patient;
    }
    public String getRecomendation(){
        return Recomendation;
    }
    public String getDate(){
        return Date;
    }
    public int  getPriority(){
        return Priority;
    }
    @Override
    public String toString(){
        return "Checkup [ " + "Doctor = " +  Doctor.toString() + ", Patient = " + Patient.toString() + ", Recomendation = " +  Recomendation + ", Date = " + Date + ", Priority = " + Priority + " ]" ;
    }
}
