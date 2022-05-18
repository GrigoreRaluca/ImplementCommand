import java.util.ArrayList;
import java.util.List;

public class Server {
    List<OperatiuniBancare> operatiuniBancareList;
    private static Server instance=null;
    private Server()
    {
        this.operatiuniBancareList=new ArrayList<>();

    }
    public static synchronized Server getInstance(){
        if(instance==null)
            instance=new Server();
        return instance;
    }
    public void adaugareOperatie(OperatiuniBancare operatiuniBancare)
    {
        operatiuniBancareList.add(operatiuniBancare);
    }
   public void getOperatiune(OperatiuniBancare operatiuni)
   {
       for(OperatiuniBancare operatiuniBancare:operatiuniBancareList)
       {
           if(operatiuniBancare.equals(operatiuni))
           {
               operatiuniBancare.efectuareOperatiune();
           }
       }
       operatiuniBancareList.remove(operatiuni);
       for(OperatiuniBancare operatiuniBancare:operatiuniBancareList)
       {
           System.out.println(operatiuniBancare);
       }
   }

}
