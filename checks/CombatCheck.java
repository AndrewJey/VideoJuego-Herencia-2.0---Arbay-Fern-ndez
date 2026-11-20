public class CombatCheck {
 public static void main(String[] args) throws Exception {

 videojuego.Elfos elfo=new videojuego.Elfos("Test",20,100,"Arco");CheckSupport.equal(elfo.getNombre(),"Test");CheckSupport.equal(elfo.getVida(),20);
 for(int i=0;i<1000;i++){int damage=elfo.Ataques();CheckSupport.check(damage>=1&&damage<=54,"Damage bound");}
 elfo.setVida(95);CheckSupport.equal(elfo.Sanacion(),100);elfo.setVida(0);CheckSupport.equal(elfo.Sanacion(),0);CheckSupport.equal(elfo.Ataques(),0);
 for(int i=0;i<50;i++){videojuego.Combate combat=new videojuego.Combate();int turns=0;while(combat.ganador()==null&&turns++<200)combat.jugarTurno(1,1);CheckSupport.check(combat.ganador()!=null,"Combat terminates");CheckSupport.check(combat.getElfo().getVida()>=0&&combat.getOrco().getVida()>=0,"No negative life");}
 videojuego.Combate combat=new videojuego.Combate();combat.getOrco().setVida(0);CheckSupport.equal(combat.jugarTurno(1,1),"Elfo");CheckSupport.equal(combat.getElfo().getVida(),100);

 CheckSupport.done();
 }
}
