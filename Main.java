public class Main {
    public static void main(String[] args) {
        Groep groep = new Groep();

        Gebruiker gebruiker1 = new Gebruiker();
        gebruiker1.setNaam("Florina");
        gebruiker1.setEmail("florina@example.com");
        groep.voegGebruikerToe(gebruiker1);

        Auto auto1 = new Auto();
        auto1.setMerk("Toyota");
        auto1.setModel("Corolla");
        auto1.setJaar(2020);
        auto1.setKenteken("AB-123-CD");
        auto1.setBrandstoftype("Benzine");
        auto1.setCapaciteit(5);
        groep.voegAutoToe(auto1);

        Reservering reservering1 = groep.maakReservering(gebruiker1, auto1, new Date(), new Time(System.currentTimeMillis()));
        groep.stelPrioriteitIn(reservering1, "Hoog");

        // Print de details van de reservering
        System.out.println("Reservering gemaakt voor " + reservering1.getGebruiker().getNaam() + " om de " + reservering1.getAuto().getMerk() + " " + reservering1.getAuto().getModel() + " te reserveren op " + reservering1.getDatum() + " om " + reservering1.getTijd() + " met prioriteit " + reservering1.getPrioriteit() + ".");
    }
}
