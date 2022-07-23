package Proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;

import Proyecto.Models.AutoNuevo;

public interface AutoNuevoDao extends CrudRepository<AutoNuevo, Long> {

    public AutoNuevo findByBrand(AutoNuevo autonuevo);

    public AutoNuevo findByModel(AutoNuevo autonuevo);

    public AutoNuevo findByYear(AutoNuevo autonuevo);

    public AutoNuevo findByColor(AutoNuevo autonuevo);
}
