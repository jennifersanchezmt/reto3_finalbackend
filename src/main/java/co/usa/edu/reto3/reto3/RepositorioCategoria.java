/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.usa.edu.reto3.reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Usuario
 */
@Repository
public class RepositorioCategoria {
    @Autowired
    private InterfaceCategoria crud2;
    public List<Categoria> getAll(){
        return (List<Categoria>) crud2.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return crud2.findById(id);
    }

    public Categoria save(Categoria Categoria){
        return crud2.save(Categoria);
    }
    public void delete(Categoria Categoria){
       crud2.delete(Categoria);
    }
}
  
