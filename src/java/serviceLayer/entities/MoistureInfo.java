package serviceLayer.entities;

import java.io.Serializable;

/**
 * 
 * Class dealing with moisture scans
 */
public class MoistureInfo {
    
    /**
     * Variables corresponding to its database counterpart. 
     */
    private int moisture_info_id, moistureValue, roomId;
    private String measurePoint;
    
    /**
     * Empty constructor. 
     */
    public MoistureInfo() {
    }

    public MoistureInfo(int moisture_info_id, String measurePoint, int moistureValue, int roomId) {
        this.moisture_info_id = moisture_info_id;
        this.measurePoint = measurePoint;
        this.moistureValue = moistureValue;
        this.roomId = roomId;
    }

        
    /**
     * Getters and setters (WE NEED TO CLEAN UP HERE BOYS) 
     */
    
    public int getMoisture_info_id() {
        return moisture_info_id;
    }

    public void setMoisture_info_id(int moisture_info_id) {
        this.moisture_info_id = moisture_info_id;
    }

    public int getMoistureValue() {
        return moistureValue;
    }

    public void setMoistureValue(int moistureValue) {
        this.moistureValue = moistureValue;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getMeasurePoint() {
        return measurePoint;
    }

    public void setMeasurePoint(String measurePoint) {
        this.measurePoint = measurePoint;
    }

}