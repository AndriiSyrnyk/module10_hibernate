package javadeveloper.module10;

import javadeveloper.module10.client.Client;
import javadeveloper.module10.client.ClientCrudService;
import javadeveloper.module10.migration.DatabaseMigrationService;
import javadeveloper.module10.planet.Planet;
import javadeveloper.module10.planet.PlanetCrudService;

public class AppTest {
    public static void main(String[] args) {
        new DatabaseMigrationService().migrate();

        ClientCrudService clientCrudService = new ClientCrudService();

        System.out.println("clientCrudService.getAllClients() = " + clientCrudService.getAllClients());
        Client client = new Client();
        client.setName("ron");
        clientCrudService.createClient(client);
        System.out.println("clientCrudService.getAllClients() = " + clientCrudService.getAllClients());
        clientCrudService.updateClientName(11, "ronald");
        System.out.println("clientCrudService.getAllClients() = " + clientCrudService.getAllClients());
        clientCrudService.deleteClientById(11);
        System.out.println("clientCrudService.getAllClients() = " + clientCrudService.getAllClients());

        PlanetCrudService planetCrudService = new PlanetCrudService();

        System.out.println("planetCrudService.getAllPlanets() = " + planetCrudService.getAllPlanets());
        Planet planet = new Planet();
        planet.setId("HJG140");
        planet.setName("planet6");
        planetCrudService.createPlanet(planet);
        System.out.println("planetCrudService.getAllPlanets() = " + planetCrudService.getAllPlanets());
        planetCrudService.updatePlanetName("HJG140", "planet66");
        System.out.println("planetCrudService.getAllPlanets() = " + planetCrudService.getAllPlanets());
        planetCrudService.deletePlanetById("HJG140");
        System.out.println("planetCrudService.getAllPlanets() = " + planetCrudService.getAllPlanets());

    }
}