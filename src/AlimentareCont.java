public class AlimentareCont extends OperatiuniBancare{
    int suma;
    @Override
    public void efectuareOperatiune() {
        super.cont=cont+suma;
        System.out.println("Contul a fost alimentat cu succes! Ati adaugat " +suma +" ron");
    }
}
