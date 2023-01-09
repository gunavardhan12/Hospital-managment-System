package hms;



public class Doctor {
    private String doctorId, Name,specialty,contact;
    private int fee;
    public Doctor(){

    }
    public Doctor ( String doctorId,String Name,String specialty,String contact, int fee){
        this.doctorId=doctorId;
        this.Name = Name;
        this.specialty = specialty;
        this.contact = contact;
        this.fee=fee;
    }
    public void setdoctorId(String doctorId){
        this.doctorId = doctorId;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public void setspecialty(String specialty){
        this.specialty = specialty;
    }
    public void setcontact(String contact){
        this.contact = contact;
    }
    public void setfee(int fee){
        this.fee = fee;
    }
    public String getdoctorId(){
        return doctorId;
    }
    public String getName(){
        return Name;
    }
    public String getspecialty(){
        return specialty;
    }
    public String getcontact(){
        return contact;
    }
    public int getfee(){
        return fee;
    }
    @Override
    public String toString(){
        return "Doctor [ " + "DoctorID = " + doctorId + ", Name = " + Name+ ", contact = " + contact+", specialty = " + specialty + ", fee = " + fee + " ]";
    }
}
