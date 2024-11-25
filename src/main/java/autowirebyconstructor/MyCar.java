package autowirebyname;

public class MyCar {

    private Specification specification11;

    public void setSpecification11(Specification specification11) {
        this.specification11 = specification11;
    }

    @Override
    public String toString() {
        return "MyCar{" +
                "specification=" + specification11 +
                '}';
    }
}
