package PracticaPrimerParcial.Ejercicio2;

public class Cliente {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setSueldo(5000);
        contrato.setCargaHoraria(80);
        contrato.setCursoEducaion(true);
        contrato.setAccesoPlataforma(true);
        contrato.setMarcadoBiometrico(false);
        contrato.setMarcadoHoraEntrada("08:00");
        contrato.setMarcadoHoraSalida("18:00");

        Contrato c1 = contrato.clone();
        c1.setNombre("Iganacio");
        c1.setApellido("Huayta");
        c1.showInfo();

        Contrato c2 = contrato.clone();
        c2.setNombre("Khenya");
        c2.setApellido("Murillo");
        c2.showInfo();

        Contrato c3 = contrato.clone();
        c3.setNombre("Juan");
        c3.setApellido("Nicolas");
        c3.showInfo();

        Contrato c4 = contrato.clone();
        c4.setNombre("Omar");
        c4.setApellido("Poma");
        c4.showInfo();

        Contrato c5 = contrato.clone();
        c5.setNombre("Yenny");
        c5.setApellido("Quisbert");
        c5.showInfo();

        Contrato c6 = contrato.clone();
        c6.setNombre("Sonia");
        c6.setApellido("Zapata");
        c6.showInfo();

        Contrato c7 = contrato.clone();
        c7.setNombre("Alvaro");
        c7.setApellido("Buen");
        c7.showInfo();

        Contrato c8 = contrato.clone();
        c8.setNombre("Camila");
        c8.setApellido("Dino");
        c8.showInfo();

        Contrato c9 = contrato.clone();
        c9.setNombre("Esteban");
        c9.setApellido("Fernandez");
        c9.showInfo();

        Contrato c10 = contrato.clone();
        c10.setNombre("Aydee");
        c10.setApellido("Gamez");
        c10.showInfo();

        Contrato c11 = contrato.clone();
        c11.setNombre("Mercedes");
        c11.setApellido("Ramoz");
        c11.showInfo();

        Contrato c12 = contrato.clone();
        c12.setNombre("Adolfo");
        c12.setApellido("Espejo");
        c12.showInfo();

        Contrato c13 = contrato.clone();
        c13.setNombre("Tomas");
        c13.setApellido("Ramones");
        c13.showInfo();

        Contrato c14 = contrato.clone();
        c14.setNombre("Ramiro");
        c14.setApellido("Perez");
        c14.showInfo();
    
        Contrato c15 = contrato.clone();
        c15.setNombre("Roberto");
        c15.setApellido("Calle");
    }
}
