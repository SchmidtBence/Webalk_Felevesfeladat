package hu.me.iit.Felevesfeladat;

import java.util.List;

public interface CarsRepository {
    List<CarsDto> findall();
    CarsDto getById(Long id);
    Long save(CarsDto carsDto);
    void deleteById(Long id);
}
