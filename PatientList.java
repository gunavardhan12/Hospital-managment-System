package hms;
class PNode {
    Patient patient;
    PNode next,pre;
    public  PNode(){

    }
    public  PNode(Patient patient){
        this.patient=patient;
        next=null;
        pre=null;
    }
}
public class PatientList{
    PNode head ,tail;
    public PatientList(){
        head=null;
        tail=null;
    }
    public void Insert(Patient patient){
        PNode node = new PNode(patient);

        if(head==null || tail == null){
            head = node;
            tail=node;
        }
        else{
            head.next = node;
            node.pre = head ;
            head = node;
        }
    }
    public Patient searchByID(String id){
        PNode temp = head;
        while(temp!=null){
            if(temp.patient.getpatientId().equals(id)){
                return temp.patient;
            }
            temp = temp.pre;
        }
        return null;
    }
    public int size(){
        PNode temp = head;
        int count =0;
        while(temp!=null){
            count++;temp =temp.pre;
        } 
        return count;
    }
    public Patient searchBycontact(String contact){
        PNode temp = head;
        while(temp!=null){
            if(temp.patient.getcontact().equals(contact)){
                return temp.patient;
            }
            temp = temp.pre;
        }
        return null;
    }
    public void PrintData(){
        PNode temp = head;
        int count =0;
        while(temp!=null){
            count++;
            System.out.println(count + ":  " + temp.patient.toString());
            temp = temp.pre;
        }
    }
    public Patient getAtIndex (int index){
        PNode temp=head;
        for (int i=0;i<index; i++){
            temp=temp.pre;
        }
        return temp.patient;
    }
}