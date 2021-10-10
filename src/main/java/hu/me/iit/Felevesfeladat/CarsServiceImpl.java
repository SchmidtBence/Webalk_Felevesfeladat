package hu.me.iit.Felevesfeladat;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarsServiceImpl implements Carservice {
    private final int MAXIMUM_CAR_COUNT=20;
    private final CarsRepository carsRepository;

    public CarsServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    @Override
    public List<CarsDto> findall() {
        return carsRepository.findall();
    }

    @Override
    public CarsDto getById(Long id) {
       return carsRepository.getById(id);
    }

    @Override
    public Long save(CarsDto carsDto) {
        if(carsRepository.findall().size()<MAXIMUM_CAR_COUNT){
            return carsRepository.save(carsDto);
        }else{
            throw new TooMuchCarException();
        }
    }

    @Override
    public void deleteById(Long id) {
            carsRepository.deleteById(id);
    }
}
