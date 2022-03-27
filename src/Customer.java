public class Customer {
    int id;
    String family;
    String name;
    String father_name;
    String address;
    int card_number;
    int bank_account;

    Customer(){ }
    Customer(int id, String family, String name, String father_name, String address, int card_number, int bank_account){
        this.id=id;
        this.family=family;
        this.name=name;
        this.father_name=father_name;
        this.address=address;
        this.card_number=card_number;
        this.bank_account=bank_account;
    }

    public int getId() {
        return id;
    }

}
