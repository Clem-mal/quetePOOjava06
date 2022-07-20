public class Wilder {
    private String firstname;
    private boolean isAware;

    public Wilder(String firstname, boolean isAware){
        this.firstname = firstname;
        this.isAware = isAware;
    
    }

    public String whoAmI(){
        if(this.isAware == false) {
            return( "Je m'appelle" + this.firstname  + " et je ne suis pas aware");
        } else {
            return( "Je m'appelle" + this.firstname  + " et je ne suis pas aware");
        }
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAnware() {
        return isAware;
    }

    public void setAnware(boolean anware) {
        this.isAware = anware;
    }
}

