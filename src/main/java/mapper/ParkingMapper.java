package mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import dto.ParkingDIO;
import service.Parking;

@Component
public class ParkingMapper {
    
    /**
     * @param parking
     * @return
     */
    public ParkingDTO ParkingDTO(Parking parking){
        return MODEL_MAPPER.map(parking, ParkingDTO.class);
    }
    public List<ParkingDIO> toParkingDTOList(List<Parking> parkingList) {
        return null;
    }
}

