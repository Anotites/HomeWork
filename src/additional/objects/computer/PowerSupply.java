package additional.objects.computer;

public class PowerSupply implements IComputer {
    private boolean exist = true;

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
}
