
package com.portafolio.proyecto.Interface;

import com.portafolio.proyecto.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();

    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto (usuario)buscándolo por ID
    public void deleterPersona(Long id);

    //Buscar un objeto (usuario) por Id
    public Persona findPersona(Long id);
}
