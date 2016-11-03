package serviceLayer.controllers;

import dataAccessLayer.DBFacade;
import dataAccessLayer.interfaces.DBFacadeInterface;
import java.util.ArrayList;
import serviceLayer.controllers.interfaces.BuildingControllerInterface;
import serviceLayer.enties.Building;
import serviceLayer.exceptions.CustomException;

public class BuildingController implements BuildingControllerInterface{

    private final DBFacadeInterface dbfacade = new DBFacade();
    
    @Override
    public void createBuilding(int user_id, String address, int postcode, String city, int floor, String description) throws CustomException {
        dbfacade.createBuilding(user_id, address, postcode, city, floor, description);
    }

    @Override
    public ArrayList<Building> getBuildings(int user_id) throws CustomException {
        return dbfacade.getBuildings(user_id);
    }

    @Override
    public ArrayList<Building> getAllBuildings() throws CustomException {
        return dbfacade.getAllBuildings();
    }

    @Override
    public void editBuilding(int selectedBuilding, String addres, int postcode, String cit) throws CustomException {
        dbfacade.editBuilding(selectedBuilding, addres, postcode, cit);
    }
}
