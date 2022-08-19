package service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.ParkingDIO;

@RestController
@RequestMapping("/parking")
public class ParkingService {
 
    private ParkingService parkingService;
    private static List<ParkingDIO> result;

    public void ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    /**
     * @return
     */
    @GetMapping
    public static List<Parking> findAll() {
        final List<ParkingDIO> list;
        List<Parking> parkingList = ParkingService.findAll();
        result = ParkingDIO.toParkingDTOLlist(parkingList);
        for (Parking parking : parkingList) {
            ParkingDIO dto = new ParkingDIO();
            dto.setId(parking.getId());

        }
        return parkingList;
    }
}
