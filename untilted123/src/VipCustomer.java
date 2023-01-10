public class VipCustomer {
    private String name;
    private int creditLimit;

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    private String email;

    public VipCustomer(){
        this.name="erceDEFAULT  ";
        this.creditLimit=1234;
        this.email="ercekilic@hotmail.com";

    }
    public VipCustomer(String name,int creditLimit){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email="defaul@gmail.com";

    }
    public VipCustomer(String name,int creditLimit,String email){
    this.name=name;
    this.creditLimit=creditLimit;
    this.email=email;
    }
}
