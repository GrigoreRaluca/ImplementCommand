public abstract class OperatiuniBancare {
     protected int cont;
     abstract void efectuareOperatiune();

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
