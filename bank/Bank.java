package bank;

// encapsulation
//four access modifier default private public protected
class Account {
    public String name;// accessable into every package
    String email;// only in that one package
    private String password;// access by getter and setter

    // which return something should have var type
    public String getPassword() {
        return this.password;

    }

    // function which does not return anything should be void
    public void setPassword(String pass) {
        this.password = pass;
    }

    // public void passs() {
    // System.out.println(password);
    // }
}

public class Bank {
    public String name;

    public static void main(String[] args) {
        Account ac2 = new Account();

        ac2.name = "natice landing";
        ac2.name = "Ajayjodedara@gmail.com";
        // ac2.password = "hrifubb"; cant change by this way
        // ac2.passs("abcd");//also cant change like thiss
        ac2.setPassword("abcd");// only change by using get and set
        // ac2.passs(); can print using this see line 19 to 21 down second way
        System.out.println(ac2.getPassword());// by using get

    }
}
