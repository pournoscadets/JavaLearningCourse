// #region snippet

public class ClassInterfaceImpl implements ClassInterface {

    public ClassInterfaceImpl() {
    
    }

    @Override
    public String affichageTemperature() {
        return "Temperature: 25°C";
    }

    @Override
    public String afficheHeure() {
        return "Heure: 12:00";
    }
}

// #endregion snippet