package hu.me.iit.Felevesfeladat;

import java.util.List;

public interface Carservice {
    List<CarsDto> findall();
    CarsDto getById(Long id);
    Long save(CarsDto carsDto);
    void deleteById(Long id);
}
