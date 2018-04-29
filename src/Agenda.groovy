
public class Agenda {
    def id
    def nombre,email
    def tel
   
    public Agenda(def id,def nombre,def email,def tel){
        this.id=id
        this.nombre=nombre
        this.email=email
        this.tel =tel 
        
    }
    public getid(){
        return id
    }
    public void setid(int id){
        this.id=id
    }
    
    public  getNombre(){
        return nombre
    }
    public void setNombre(String Nombre){
        this.nombre=nombre;
    } 
    public  getemail(){
        return email
    }
    public void setemail(String email){
        this.email=email
    }
    public gettel(){
        return tel
    }
    public void settel(int tel){
        this.tel=tel
    }

    public String print(){
        return "ID :"+this.getid+"Persona: "+this.getNombre()+"Email"+this.getEmail()+"Telefono"+this.getTel()
    }

}
