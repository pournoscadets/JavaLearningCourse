// #region snippet

public class ClassFille extends ClassMere {
    private String ecole;

    public ClassFille(String nom, String prenom, int age, String ecole) {
        super(nom, prenom, age);
        this.ecole = ecole;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

}

// #endregion snippet