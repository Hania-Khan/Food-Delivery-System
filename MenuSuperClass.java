
package food.ordering.system;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MenuSuperClass {
    protected double BeefBurger;
    protected double ZingerBurger;
    protected double Nuckerburger;
    protected double bacconBurger;
      

      protected double seekhkabab;
      protected double reshmikabab;
      protected double golakabab;
      protected double tikka;
      
      
      protected double spagethi;
      protected double manchurian;
      protected double shahshilkrice;
      protected double alfredo;
      
      
      protected double burgers;
      protected double  chinese;
      protected double barbecue;
      protected double Totalbsb;
      
      
      protected double allTotalbsb;
      protected double GetAmount(){
      
       burgers=BeefBurger+ZingerBurger+Nuckerburger+bacconBurger;
      chinese=spagethi+manchurian+shahshilkrice+alfredo;
      barbecue=seekhkabab+reshmikabab+golakabab+tikka;
       
      
      Totalbsb=burgers+chinese+barbecue;
      
      
      allTotalbsb=Totalbsb;
      return allTotalbsb;
      
      }
      
      //default constructor
      
      public MenuSuperClass(){
      }
        
private JFrame frame;

public void iExitSystem(){
    
   
    frame= new JFrame("EXIT");
 
  if (JOptionPane.showConfirmDialog(frame,"CONFIRM IF YOU WANT TO EXIT ","RESTAURANT MANAGEMENT SYSTEMS" ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
System.exit(0);

}
 

}




  protected double PRCIE_BeefBurger=300;
      protected double PRCIE_ZingerBurger=250;
      protected double PRCIE_Nuckerburger=400;
      protected double PRCIE_bacconBurger=500;
      

      protected double PRCIE_seekhkabab=300;
      protected double PRCIE_reshmikabab=300;
      protected double PRCIE_golakabab=300;
      protected double PRCIE_tikka=500;
      
      
          protected double PRCIE_spagethi=300;
      protected double PRCIE_manchurian=300;
      protected double PRCIE_shahshilkrice=400;
      protected double PRCIE_alfredo=400;
      
      protected double nctax=0.001 ;
      
      public Double cFindTax(double cAmount)
      {{
          
          
          double FindTax=cAmount=(cAmount*nctax);
          return FindTax;
      }
      }
      
      
      
      /////////////// GETTERS AND SETTERS ///////////////////////
      
     public void setBeefBurger(Double BeefBurger){
        this.BeefBurger = BeefBurger;
    }
    public double getBeefBurger(){
        return BeefBurger;
    }
    
    public void setZingerBurger(Double ZingerBurger){
        this.ZingerBurger = ZingerBurger;
    }
    public double getZingerBurger(){
        return ZingerBurger;
    }
    
    public void setNuckerBurger(Double NuckerBurger){
        this.Nuckerburger = NuckerBurger;
    }
    public double getNuckerBurger(){
        return Nuckerburger;
    }
    
    public void setbacconBurger(Double bacconBurger){
        this.bacconBurger = bacconBurger;
    }
    public double getbacconBurger(){
        return bacconBurger;
    }
    
    public void setgolakabab(Double golakabab){
        this.golakabab = golakabab;
    }
    public double getgolakabab(){
        return golakabab;
    }
    
    public void setreshmikabab(Double reshmikabab){
        this.reshmikabab = reshmikabab;
    }
    public double getreshmikabab(){
        return reshmikabab;
    }
    
    public void settikka(Double tikka){
        this.tikka = tikka;
    }
    public double gettikka(){
        return tikka;
    }
    
    public void setspagethi(Double spagethi){
        this.spagethi = spagethi;
    }
    public double getspagethi(){
        return spagethi;
    }
    
    public void setmanchurian(Double manchurian){
        this.manchurian = manchurian;
    }
    public double getmanchurian(){
        return manchurian;
    }
    
    public void setshahshilkrice(Double shahshilkrice){
        this.shahshilkrice = shahshilkrice;
    }
    public double getshahshilkrice(){
        return shahshilkrice;
    }
    
    public void setalfredo(Double alfredo){
        this.alfredo = alfredo;
    }
    public double getalfredo(){
        return alfredo;
    }
    
    
    
    public void setburgers(Double burgers){
        this.burgers = burgers;
    }
    public double getburgers(){
        return burgers;
    }
    
    public void setchinese(Double chinese){
        this.chinese = chinese;
    }
    public double getchinese(){
        return chinese;
    }
    
    public void setbarbecue(Double barbecue){
        this.barbecue = barbecue;
    }
    public double getbarbecue(){
        return barbecue;
    }
    
    public void setTotalbsb(Double Totalbsb){
        this.Totalbsb = Totalbsb;
    }
    public double getTotalbsb(){
        return Totalbsb;
    }
    
    public void setallTotalbsb(Double allTotalbsb){
        this.allTotalbsb = allTotalbsb;
    }
    public double allTotalbsb(){
        return allTotalbsb;
    }
    
    public void setPRCIE_BeefBurger(Double PRCIE_BeefBurger){
        this.PRCIE_BeefBurger = PRCIE_BeefBurger;
    }
    public double getPRCIE_BeefBurger(){
        return PRCIE_BeefBurger;
    }
    
    public void setPRCIE_ZingerBurger(Double PRCIE_ZingerBurger){
        this.PRCIE_ZingerBurger = PRCIE_ZingerBurger;
    }
    public double getPRCIE_ZingerBurger(){
        return PRCIE_ZingerBurger;
    }
    
    public void setPRCIE_Nuckerburger(Double PRCIE_Nuckerburger){
        this.PRCIE_Nuckerburger = PRCIE_Nuckerburger;
    }
    public double getPRCIE_Nuckerburger(){
        return PRCIE_Nuckerburger;
    }
    
    public void setPRCIE_bacconBurger(Double PRCIE_bacconBurger){
        this.PRCIE_bacconBurger = PRCIE_bacconBurger;
    }
    public double getPRCIE_bacconBurger(){
        return PRCIE_bacconBurger;
    }
    
    public void setPRCIE_seekhkabab(Double PRCIE_seekhkabab){
        this.PRCIE_seekhkabab = PRCIE_seekhkabab;
    }
    public double getPRCIE_seekhkabab(){
        return PRCIE_seekhkabab;
    }
    
    public void setPRCIE_reshmikabab(Double PRCIE_reshmikabab){
        this.PRCIE_reshmikabab = PRCIE_reshmikabab;
    }
    public double getPRCIE_reshmikabab(){
        return PRCIE_reshmikabab;
    }
    
    public void setPRCIE_golakabab(Double PRCIE_golakabab){
        this.PRCIE_golakabab = PRCIE_golakabab;
    }
    public double getPRCIE_golakabab(){
        return PRCIE_golakabab;
    }
    
    public void setPRCIE_tikka(Double PRCIE_tikka){
        this.PRCIE_tikka = PRCIE_tikka;
    }
    public double getPRCIE_tikka(){
        return PRCIE_tikka;
    }
    
    public void setPRCIE_spagethi(Double PRCIE_spagethi){
        this.PRCIE_spagethi = PRCIE_spagethi;
    }
    public double getPRCIE_spagethi(){
        return PRCIE_spagethi;
    }
    
    public void setPRCIE_manchurian(Double PRCIE_manchurian){
        this.PRCIE_manchurian = PRCIE_manchurian;
    }
    public double getPRCIE_manchurian(){
        return PRCIE_manchurian;
    }
    
    public void setPRCIE_shahshilkrice(Double PRCIE_shahshilkrice){
        this.PRCIE_shahshilkrice = PRCIE_shahshilkrice;
    }
    public double getPRCIE_shahshilkrice(){
        return PRCIE_shahshilkrice;
    }
    
    
    public void setPRCIE_alfredo(Double PRCIE_alfredo){
        this.PRCIE_alfredo = PRCIE_alfredo;
    }
    public double getPRCIE_alfredo(){
        return PRCIE_alfredo;
    }
          public void setnctax(Double nctax){
        this.nctax = nctax;
    }
    public double getnctax(){
        return nctax;
    }
      
      
    


}