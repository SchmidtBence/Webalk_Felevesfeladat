package hu.me.iit.Felevesfeladat;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsRepositoryMemoryImpl implements CarsRepository {
    private final List<CarsDto> cars=new ArrayList<>();

    private int findCarById(Long id) {
        int found = -1;
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getId()==id) {
                found = i;
                break;
            }
        }
        return found;
    }


    @Override
    public List<CarsDto> findall() {
        return cars;
    }

    @Override
    public CarsDto getById(Long id) {
        return null;
    }

    @Override
    public Long save(CarsDto carsDto) {
        int found = findCarById(carsDto.getId());

        if (found == -1) {
            cars.add(carsDto);

        } else {
            CarsDto foundCar = cars.get(found);
            foundCar.setModel(carsDto.getModel());
            foundCar.setType(carsDto.getType());
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findCarById(id);

        if (found != -1) {
            cars.remove(found);
        }
    }
}
