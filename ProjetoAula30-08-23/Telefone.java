public class Telefone{
    
    private int DDD;
    private int priNum;
    private int segNum;
    
    
    public void setDDD(int DDD){
        this.DDD = DDD;
    }
    
    public void setPriNum(int priNum){
        this.priNum = priNum;
    }
    
    public void setSegNum(int segNum){
        this.segNum = segNum;
    }
    
    public int getDDD(){
        return this.DDD;
    }
    
    public int getPriNum(){
        return this.priNum;
    }
    
   
       public int getSegNum(){
        return this.segNum;
    }
    
    
    public String toString(){
        return "("+this.DDD +")"+this.priNum + "-" +this.segNum;
    }
}