class Admin {
    def agendaList = [] as Set
    
    public Build(){
        
        agendaList.add(new Agenda(id: 1, nombre: "Anakin", email: "anakin@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/anakin"))
        agendaList.add(new Agenda(id: 2, nombre: "Darth Vader", email: "darth-vader@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/darth-vader"))
        agendaList.add(new Agenda(id: 3, nombre: "Luke", email: "luke@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/luke"))
        agendaList.add(new Agenda(id: 4, nombre: "Obi-Wan", email: "obi-wan@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/obi-wan"))
        agendaList.add(new Agenda(id: 5, nombre: "Chewbacca", email: "chewbacca@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/chewbacca"))
        agendaList.add(new Agenda(id: 6, nombre: "Padme", email: "padme@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/padme"))
        agendaList.add(new Agenda(id: 7, nombre: "Emperor", email: "emperor@starwars.com", tel: "+506 90098670", website: "www.starwars.com", facebook: "www.facebook.com/emperor"))
       
        agendaList.forEach((agenda) {
            println(auto.print());
        });
    }
    
    public void print() {
        agendaList.forEach(agenda) {
                println(agenda.print());
            }
    }
    public void sortbytel(){
        Collections.sort(agendaList,new Sortbyid());
    }

    public class Sortbyid implements Comparator<Agenda>{
        
        public int compare(Agenda o1, Agenda o2) {
            if (o1.getId()()<o2.getId()()) {
                return 1;
            }else if(o1.getId()>o2.getId())
            return -1;
            return o1.getId().compareTo(o2.getId());
        }
    }

}
