package DAO;

import MODELO.*;
import java.util.LinkedList;

public interface evaltiDAO {
    public LinkedList<evalti> listar();
    
    public evalti obtener(int codigo);
    
    public void crear(evalti eva);

    public void modificar(evalti eva);

    public void eliminar(int codigo);
    
    public LinkedList<evalti> compararLogin();
    
    public LinkedList<evalti> gerente();
    
    //public LinkedList<evalti> usuex();
}
