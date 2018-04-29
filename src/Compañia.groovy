
class Compañia extends Agenda {
    
    def web,facebook
    
   public Compañia(def web,facebook){
       super(def nombre,def email,def id)
       this.web=web
       this.facebook=facebook
}
   
   public String getweb(){
       return web
   }
   public String setweb(def web){
       this.web=web
   }
   public String getfacebook(){
       return facebook
   }
   public String setfacebook(def Facebook){
       this.facebook
   }
   
   
   public String print(){
       return +"ID"+this.getid+"Compañia"+this.getNombre()+"Pagina Web"+this.getWeb()+"Facebook"+this.getfacebook()
       
   }
}



