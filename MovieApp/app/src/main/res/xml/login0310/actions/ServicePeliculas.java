package xml.login0310.actions;

public class ServicePeliculas {

    private ViewPeliculas view;
    public ServicePeliculas(ViewPeliculas view){
        this.view = view;
    }

    void getDatosPeliculas(){
        // Voy a por los datos
        // VIAJOOOOOOOOO A POR LOS DATOS!!!!!!!!!!!!
        // THREADS!!!!!!!!!!!!!!!!!!!!
        // RETROFIT!!!!!!!!!!!!
        // Toast.makeText(MainActivity.getInstance(), "Welcome To Miami!!!", Toast.LENGTH_SHORT).show();
        view.showPeliculas("Los datos han ido bien: ['films': {''}]");

        // fetch ("url=http://")-->
        // json


    }
}
