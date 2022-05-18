public class TransferBani extends OperatiuniBancare{
    int suma;
    @Override
    public void efectuareOperatiune() {
        super.cont=cont-suma;
        System.out.println("Suma a fost transferata cu succes! Ati adaugat " +suma +" ron");
    }
}
