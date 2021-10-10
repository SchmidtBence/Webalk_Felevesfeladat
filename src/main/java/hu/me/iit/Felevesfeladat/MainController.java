package hu.me.iit.Felevesfeladat;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path="cars")
public class MainController {

    private final Carservice carservice;


    public MainController(Carservice carservice) {
        this.carservice = carservice;
    }

    @GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<CarsDto> allCars(){
        return carservice.findall();
    }

    @GetMapping(path="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public CarsDto getStudentById(@PathVariable("id") Long id) {
        return carservice.getById(id);
    }

    @PostMapping(path="")
    public void newStudent(@Valid @RequestBody CarsDto carsDto) {
        carservice.save(carsDto);
    }

    @PutMapping(path="")
    public void replaceStudent(@Valid @RequestBody CarsDto carsDto) {
        carservice.save(carsDto);
    }

    @DeleteMapping(path="/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        carservice.deleteById(id);
    }
}
